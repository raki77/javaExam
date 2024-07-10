public class guguDan_2
{
 public static void main(String[] args)
 {


  int i = Integer.parseInt(args[0]);
  System.out.println(i + " Dan");
  
  for(int j=1; j<=9; j++) {
   System.out.println( i + "*" + j + "=" + (i*j));
  }


  System.out.println("");
  
 }
}

