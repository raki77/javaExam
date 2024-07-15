 // 스태틱이 가장 먼저 잡히고, 스태틱으로 선언되면 메모리가 다른 곳에 잡히게 된다.
  // 그 다음, 일반적인 객체들은 생성되었을 때 힙영역에 잡히게 된다.

 

  public class InitialTest {

      int  InstanceInt1;
      final int InstanceInt2;   // 만일 초기화값을 주면 다음에 변경불가
      static int ClassInt;

      {
             InstanceInt1 = 10;
             System.out.println("인트턴스가 초기화됨");
      }

       static {
            ClassInt = 20;
            System.out.println("클래스변수가 초기화됨");
       }
  
    //2_1, 3_1
       public InitialTest(int Value) { // Value=30 , 40
            InstanceInt2 = Value;
            System.out.println("생성자에서 받은 값은" + Value);
       }

    //2_2, 3_2
       public void printInstanceInt() {
                 System.out.println("인트턴스 변수 " + InstanceInt2);
      }

   //1
      public static void printStaticInt() {
                 System.out.println("클래스 변수는 " + ClassInt); //

       }
  
 //생성자는 클래스 이름과 같은클래스

      public static void main(String[] agrs) {
          
     InitialTest.printStaticInt(); //1
          
     InitialTest obj1 = new InitialTest(30); //2_1
           obj1.printInstanceInt(); //2_2
      
     InitialTest obj2 = new InitialTest(40); //3_1
           obj2.printInstanceInt(); //3_2
      }


}
