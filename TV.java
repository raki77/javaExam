// 인터페이스도 내부는 추상 클래스이므로, 명시적 선언이 필요하다.
// 다중 상속이 가능하게 해준다.
// TV.java
public class TV implements Volume, TurnOff
{
 public void volumeUp(int level){};
 public void volumeDown(int level){};

 public void powerTrunOn(int power) {};
 public void powerTrunOff(int power) {};

 public static void main(String[] args)
 {

  System.out.println("Hello World!");
 }
}

///////////////////////////////////////////
// TurnOff.java
public interface TurnOff
{
	public void powerTrunOn(int power);
	public void powerTrunOff(int power);
}


///////////////////////////////////////////
// Volume.java
public interface Volume
{
  public void volumeUp(int level);
  public void volumeDown(int level);
 
}
