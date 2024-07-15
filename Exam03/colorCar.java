// 상속 받을때는 Car클래스 내에 car() {} 생성자를 꼭 명시해야한다.
public class colorCar extends Car
{
 String carColor;

 public colorCar(String c, String name, int speed) {
  super(1); //상위 클래스 생성자 값안에 int,string값을 넣어야 가능하다.
  carName = name;
  carColor = c;
  velocity = speed;
 }
 
 public static void main(String[] args)
 {
  colorCar cc;
  cc = new colorCar("하얀색", "좋은차", 100);
  System.out.println(cc.carColor + "," + cc.carName + "," + cc.velocity);

 }
}