public class Car
{
 //멤버변수
  protected int velocity;
  protected int whellNum;
  protected String carName;


 //파라메터 없는 생성자 (default 생성자)
 // jvm이 생성자 자동 생성 (상속시는 x)
 /*public Car() {
  System.out.println("상위 클래스 생성자");
 }*/

  public Car(int speed)  //생성자
  { velocity =speed; }


  public Car(int speed, String name) //생성자
  { this(speed);  carName=name; }


  public void speedUp() { velocity = velocity +1 ; }
 

  public void speedUp(int speed)  { velocity += speed ;}


  public void speedDown() { 
   velocity = velocity -1 ; 
   if(velocity < 0)
   velocity=0;
  }

  public void stop()  { velocity = 0; }

  
}

 