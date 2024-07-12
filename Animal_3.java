// 인터페이스와 추상 클래스3
abstract class Animal3 {
    abstract void makeNoise();
    abstract String getName();
    abstract void setName(String name);
   }
   
   class Cat3 extends Animal3 {
    
    private String name;
    
    public void makeNoise(){
     System.out.println("야옹~!!");
    };
    public String getName(){
     return name;
    };
    public void setName(String name){
     this.name = name;
    };
    
    public String toString(){
     return name;
    }
    
    public boolean equals(Object obj){
     
     /*if((obj) instanceof Cat3){
      return false;
     }*/
     
     Cat3 cat = (Cat3)obj;
     
     if(name == cat.name){
      return true;
     }else{
      return false;
     }
    }
   }
   
   public class Animal_3{
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     Cat3 c = new Cat3();
     c.makeNoise();
     makeNoise(c);
     
     Animal3 an = new Cat3();
     makeNoise(an);
     an.makeNoise();
     
     c.setName("삐야새끼");
     String name = c.getName();
     System.out.println(name);
     
     an.setName(name +"가 아니라 멍멍이");
     System.out.println(an.getName());
     System.out.println(an.toString());
     
     Cat3 c2= new Cat3();
     Cat3 c3 = c2;
     
     Cat3 c4 = new Cat3();
     
     c2.setName("1");
     c4.setName("2");  
     
     if(c2==c3){
      System.out.println("c2와 c3는 같다.");
     }else{
      System.out.println("c2와 c3는 다르다.");
     }
     
     if(c2.equals(c4)){
      System.out.println("c2와 c4는 같다.");
     }else{
      System.out.println("c2와 c4는 다르다.");
     }
     
    }
     
    public static void makeNoise(Animal3 an3){
     an3.makeNoise();
    }
   
   }
   
    