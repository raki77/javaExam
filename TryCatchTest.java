import java.io.*;
import java.awt.*;

public class TryCatchTest
{
 public static void main(String args[])
 {
  try{
   throwException();
   System.out.println("오류제어1");
  }catch(IOException ex){
   System.out.println("오류제어2");
   }
   catch(Exception ex){
    System.out.println("오류제어3");
    }
   finally{
    System.out.println("오류제어4"); 
    }
   System.out.println("오류제어5");
  
  }   //main여기서 끝남.
  public static void throwException() throws IOException,ClassNotFoundException
  {
   int i= (int)(Math.random()*4);
   
   switch(i)
   {
    case 0:
     throw new IOException("에러를 던진다");
    case 1:
     throw new ClassNotFoundException("에러를 던진다2");
     case 2:
     throw new AWTError("에러를 던진다3");
     default:
   }
 }
 

}
