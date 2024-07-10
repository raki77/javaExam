public class TestEx
{


 static Person person;
 Person p = new Person("1111");
 Person p1 = new Person("2222");

 

 public static void main(String[] args)
 {
  TestEx ex = new TestEx();
  ex.put("3333");
  System.out.println(ex.p.toString());
 }

 

 public void put(String name) {
  person = new Person(name);
 }

 

 public class Person
 {


  String name;


  public Person(String name) { this.name = name; } // 생성자

 

  public String toString() {
   return ("내 이름은 :"+ name);


  }

 


 }
}
