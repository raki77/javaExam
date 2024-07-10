public class CallByValueTest
{
 public static void main(String[] args)
 {
  int i = 10;
  int j = 30; 

  System.out.println("호출 전의 값 i,j = "+ i + "," + j); //10,30
  convertInt(i,j);
  System.out.println("호출 후의 값 i,j = "+ i + "," + j); //10,30 

 }
 
 static void convertInt(int i, int j) { 

  System.out.println("메소드 안에서 변경 전의 값 i,j = "+ i + "," + j); //10,30
  int temp =0;
  temp = i;
  i=j;
  j=temp;
  System.out.println("메소드 안에서 변경 후의 값 i,j = "+ i + "," + j); //30,10 

 } 

}
