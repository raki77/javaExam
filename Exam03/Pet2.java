// abstract class and interface

interface Pet {
    public abstract void beFriendly();
    public abstract void play();
   }
   
   abstract class Animal2 {
    public void Noise(){
     System.out.println("추상 클래스 소리");
    };
    public void sleep(){
     System.out.println("추상 클래스 잠자기");
    };  
   }
   class Cat2 extends Animal2 {
    public void Noise(){
     System.out.println("고양이 소리");
    } 
   }
   
   public class Pet2 extends Animal2 implements Pet {
    public void beFriendly(){
     System.out.println("인터페이스 프렌들리");
    };
    public void play(){
     System.out.println("인터페이스 플레이");
    }
    
    public static void main(String[] args){
     
     Pet2 p = new Pet2();
   
     p.beFriendly();
     p.play();
     p.Noise();
     p.sleep();
     
     Animal2 c = new Cat2();
     c.Noise();
     
    }
    
   }
   
   