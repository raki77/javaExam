
//String을 텍스트 파일에 저장
import java.io.*;

public class WriteAFile
{
 public static void main(String[] args)
 {

//입출력 관련 코드는 모두 try/catch 블록 안에
  try 
  {
   FileWriter writer = new FileWriter("Foo.txt");
   writer.write("Hello JAVA");
   writer.close();
  }
  catch (IOException ex)
  {
   ex.printStackTrace();    
  }


 }
}