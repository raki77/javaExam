import java.util.*;
import java.io.*;

//ArrayList이용한 간단한 파일 정렬
public class Jukebox1 {

 /**
  * @param args
  */
 // 곡제목 들은 String으로 구성된 ArrayList에 저장합니다.
 ArrayList<String> songList = new ArrayList<String>();
  
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  new Jukebox1().go();
 }
 
 // 파일 로딩을 시작하고 songList ArrayList에 들어있는 내용을 출력하는 메소드.
 public void go(){
  getSongs();
  System.out.println(songList);
  
  //java.util.collections에 있는 sort()쓰기.
  Collections.sort(songList);
  System.out.print(songList);
 }
 
 //여기에는 별로 특별한 건 없습니다. 파일을 읽어들이고 각 행에 대해서 addSong()을 호출합니다.
 void getSongs(){
  try{
   File file = new File("SongList.txt");
   BufferedReader reader = new BufferedReader(new FileReader(file));
   String line = null;
   while((line=reader.readLine())!= null) {
    addSong(line);
   }
  }catch(Exception ex) {
   ex.printStackTrace();
  }
 }
 
 // addSong메소드는 입출력에 관한 내용을 배울 때 암기장을 처리했던 코드하고 똑같은
 // 식으로 작동합니다. 제목과 아티스트가 모두 들어있는 각 줄을 split()메소드를 써서
 // 두조각(토큰)으로 나누는 거죠.
 void addSong(String lineToParse) {
  String[] tokens = lineToParse.split("/");
  // 곡제목만 필요하기 때문에 첫 번째 토큰만 songList에 넣음.
  songList.add(tokens[0]);
 }

}