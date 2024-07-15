import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;

public class PageViewer extends Frame
{
 private TextField tUrl = new TextField("");

 //웹페이지의 소스를 보여주는 텍스트 영역
 private TextArea tPage = new TextArea();

 private BufferedReader reader;
 public PageViewer(String title) {
  super(title);
  tPage.setEditable(false);
  add(tUrl, "North");
  add(tPage,"Center");

  //tUrl의 액션 이벤트 처리
  tUrl.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent ae) {
    try{
     //tUrl의 내용에 해당하는 url 객체가 참조하는 웹 페이지를 읽ㅇ는다.
     readPage(new URL(tUrl.getText()));
    }catch(MalformedURLException ie) {
     tPage.setText("URL이 잘못되었습니다.");
    }
   }
  });
 }
 
 //url 객체가 참조하는 웹페이지를 읽어오는 메소드
 void readPage(URL url) {
  tPage.setText("");
  String line;
  try{
   //url의 입력 스트림을 얻는다
   reader= new BufferedReader(new InputStreamReader(url.openStream()));
   
   //한 줄 단위로 읽어서 tPage에 추가한다.
   while((line =reader.readLine())!= null)
    tPage.append(line +"\n");

  }catch(IOException ie) {
   tPage.setText("입출력 예외가 발생하였습니다.");
  }finally{
   try{
    if(reader!=null) reader.close();
   }catch(Exception e) {}
  }
 }

 
 public static void main(String[] args)
 {
  PageViewer me = new PageViewer("Page Viewer");
  me.setSize(400,400);
  me.setVisible(true);
 }
}

