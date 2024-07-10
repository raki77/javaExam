public class ArrayTest
{
 public static void main(String[] args)
 {


  System.out.println("자바 배열 연습");
  
  //선언과 동시에 값 할당.
  int a[] = new int[] {1,2,3};

  for(int i=0; i<a.length; i++) {
   System.out.println("값 출력:"+a[i]);
  }

 

  // 선언과 객체 생성 따로
  int b[];
  b= new int[3];
  b[0]= 1;
  b[1]= 2;
  b[2]= 3;

 

  for(int i=0; i<b.length; i++) {
   System.out.println("값 출력:"+b[i]);      
  }

 

 }


}
