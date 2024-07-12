
// extend to Car.java
public class AccessCar
{
 public static void main(String[] args)
 {
  Car myCar;
  myCar = new Car(100,"좋은차");
  System.out.println(myCar.carName + " " + myCar.velocity);
 }
}