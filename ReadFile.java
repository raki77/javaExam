
//텍스트 파일을 읽은 방법


import java.io.*;

public class ReadFile
{
 public static void main(String[] args)
 {


  try
  {
   File myFile = new File("MyText.txt");


   // FileReader는 텍스트 파일로 연결 되는 문자를 위한 연결 스트림
   FileReader fileReader = new FileReader(myFile);
   
   // 읽기 작업 효율 위해
   BufferedReader reader = new BufferedReader(fileReader);

 

   //행을 읽어 올 때마다 각 행을 저장하기 위한 string 변수
   String line = null;

 

   //텍스트 한 행을 읽은 다음 그 행을 line변수에 저장.
   while((line = reader.readLine()) != null) {
    System.out.println(line);
   }


   reader.close();


  }


  catch (Exception ex)
  {
   ex.printStackTrace();
  }


 }
}