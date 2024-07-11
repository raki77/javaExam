// Truck2.java
class Truck2 extends Car2
{
  public void speedUp(int speed) // car2의 추상메소드 speedUp을 상속
  {

   };
  
  public void speedDown(int speed) // car2의 추상메소드 speedDown을 상속
  {};
 
  public static void main(String args[])
  {
  //car2는 객체 생성x
     Truck2 myTruck;
   
    myTruck = new Truck2();
    myTruck.speedUp(200);
   
    System.out.println("내 차의 속도는:"+myTruck.velocity);
   
  }

}  



///////////////////////////////
// another file
///////////////////////////////
// Car2.java


abstract class Car2{

protected int velocity;
protected int whellNum;
protected String carName;
 
abstract public void speedUp(int speed);
abstract public void speedDown(int speed); 

public void stop()
  {
	  velocity = 0;
  }

}


