// interface 
// WalkMan.java
public class WalkMan implements AdvancedVolume
{
 public void volumeOff(){};
 public void volumeResume(){};
 public void volumeUp(int level){};
 public void volumeDown(int level){};

 public static void main(String[] args)
 {
  System.out.println("워크맨 프로그램");
 }
}

// AdvancedVolume.java
// need to save another file under codes.
public interface AdvancedVolume extends Volume
{
	public void volumeOff();
	public void volumeResume();
}

// Volume.java
// need to save another file under codes.
public interface Volume
{
  public void volumeUp(int level);
  public void volumeDown(int level);
 
}
