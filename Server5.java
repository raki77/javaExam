// inbound, outbound all, interactive, chatting server

import java.net.*;
import java.io.*;
import java.util.*;

public class Server5 {
 private ServerSocket server;
 public BManager bMan = new BManager(); //메세지 방송자
 public Server5(){};

 void startServer() {
  try{
   server = new ServerSocket(7777);
   System.out.println("서버 소켓이 생성되었습니다");
   while(true) {
    Socket socket = server.accept();

    //클라이언트와 통신하는 스레드를 생성하고 실행
    new Chat_Thread(socket).start();

    //방송자의 리스트에 socket을 추가한다.
    bMan.add(socket);

    //방송자는 모든 클라이언트에게 현재 접속 인원
    //수를 전송한다.
    bMan.sendClientInfo();
   }
  }catch(Exception e) {
   System.out.println(e);
  }
 }

 public static void main(String[] args)
 {
  Server5 server = new Server5();
  server.startServer();
 }
 
 // 클라이언트와 통신하는 스레드 클래스
 class Chat_Thread extends Thread
 {
  Socket socket;
  private BufferedReader reader;
  private PrintWriter writer;
  Chat_Thread(Socket socket) {
   this.socket = socket;
  }
 
  public void run() {
   try{
    reader = new BufferedReader(
     new InputStreamReader(socket.getInputStream()));
    String msg;
 
    //입력 스트림으로 부터 메시지를 얻는다.
    while((msg=reader.readLine())!= null) {
     System.out.println(msg);
 
     //모든 클라이언트에게 메시지를 전송
     bMan.sendToAll(msg);
    }
   }catch(Exception e) {
   }finally {
    try{
     //방송자의 리스트에서 socket을 제거
     bMan.remove(socket);
     if(reader!=null) reader.close();
     if(writer!=null) writer.close();
     if(socket!=null) socket.close();
     reader = null;
     writer = null;
     socket = null;
 
     System.out.println("클라이언트가 나갔습니다");
 
     //모든 클라이언트에게 현재 접속 인원의 수를 전송
     bMan.sendClientInfo();
    }catch(Exception e) {}
   }
 
  }
 
 }
 
 // 메시지 방송자 클래스 , vector를 상속
 class BManager extends Vector {
 
  BManager(){};
  void add(Socket sock) {
   //소켓 추가
   super.add(sock);
  }
 
  void remove(Socket sock){
   //소켓 제거
   super.remove(sock);
  }
 
  //모든 클라이언트에게 msg를 전송한다. 동기화 메소드
  synchronized void sendToAll(String msg) {
   //모든 소켓의 출력 스트림으로 msg를 출력한다.
   PrintWriter writer = null; //출력 스트림
   Socket sock; //소켓
 
   for(int i=0;i<size();i++) { //소켓의 개수만큼 반복 실행
    sock = (Socket)elementAt(i); // i번째 소켓을 얻는다.
    try
    {
     //i번째 소켓의 출력 스트림을 얻는다.
     writer = new PrintWriter(sock.getOutputStream(),true);
    }
    catch (IOException ie){}
 
    //i번째 소켓의 출력 스트림으로 msg를 출력한다.
    if(writer!= null) writer.println(msg);
   }
  }
  
  //모든 클라이언트에게 현재 채팅 인원의 수를 전송
  synchronized void sendClientInfo(){
   //모든 소켓의 출력 스트림으로 현재 채팅 인원의 수를 출력한다.
   String info= "현재 채팅 인원: "+ size();
   System.out.println(info);
   sendToAll(info);
  }
 
 }

}