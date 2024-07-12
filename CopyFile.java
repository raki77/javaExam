import java.io.*;

public class CopyFile
{
 public CopyFile(String x, String y) {
  try
  {
   File myFile = new File(x);
   FileReader fileReader = new FileReader(myFile);
   BufferedReader reader = new BufferedReader(fileReader);

   File file = new File(y);
   PrintWriter out = new PrintWriter(new FileWriter(file));

   String line = null;
   while((line=reader.readLine())!=null){
    System.out.println(x + "로 부터 파일 읽기:");
    System.out.println(line);

    System.out.println(y + "에 파일 저장:");
    System.out.println(line+"\n");
    out.println(line);
   }
   reader.close();
   out.close();
   
  }
  catch (Exception ex)
  {
   ex.printStackTrace();
  }
 }
  
 public static void main(String[] args)
 {
  new CopyFile(args[0],args[1]);
 }
}