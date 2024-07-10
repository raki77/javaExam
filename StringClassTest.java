public class StringClassTest
{


 public static void main(String[] args)
 {


  String s = new String("Hello");
  System.out.println(s);

  s = null; //stack으로 힙영역의 접근을 해제.
  
  s = new String("Hi");
  System.out.println(s);
 }


/*
 1. new 객체 생성시 : 인스턴스 -> 생성자 호출 => 명시적 호출.
 2. 객체 생성하게 되면 a 번지수 (레퍼런스)
 3. 소멸자(?) - 자바는 JVM에서 가비지 컬렉션이라 불리우는 형태의 로직에 의해서
                JVM이 판단하여 객체 소멸.
 4.
*/

}
