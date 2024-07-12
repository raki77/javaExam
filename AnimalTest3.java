// 인터페이스와 추상클래스 2
interface jsh {
    public abstract void play();
    public abstract void stop(); 
   }
   
   abstract class Animal4 {
    abstract public void makeNoise();
    abstract public String getName();
    abstract public void setName(String name);
    abstract public String addName(String name2);
   }
   
   class Cat4 extends Animal4{
    String name;
    public void makeNoise(){ System.out.println("고양이 소리"); }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String addName(String name2){  
     this.name += name2;  
     return this.name;
    }
   }
   
   class Dog4 extends Animal4{
    String name;
    public void makeNoise(){ System.out.println("개 소리"); }
    public String getName(){ return name; }
    public void setName(String name){  this.name = name; }
    public String addName(String name2){
     this.name += name2;
     return this.name;
    }
   }
   
   public class AnimalTest3 implements jsh{
    
    public void play(){  System.out.println("interface play()"); }
    public void stop(){  System.out.println("interface stop()"); }
    
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     
     Dog4 dog = new Dog4();
     dog.setName("복실이");
     
     Cat4 cat = new Cat4();
     cat.setName("고양이");
     
     Animal4 an = new Cat4();
     an.setName("Interface");
     
     
     System.out.println(dog.getName());
     dog.addName("와 누렁이");
     
     System.out.println(cat.getName());
     cat.addName("와 호랑이");
     
     System.out.println(an.getName());
     
     new AnimalTest3().play();
     new AnimalTest3().stop();
   
    }
   }