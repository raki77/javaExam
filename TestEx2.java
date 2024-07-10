public class TestEx2
{
 static Person person;
 Person p = new Person("1111");
 Person p1 = new Person("2222");

 

 public static void main(String[] args)
 {


  TestEx2 ex = new TestEx2();
  ex.put("3333");

  System.out.println(ex.p.toString());

 

  ex.p1.name="4444";

  System.out.println(ex.p1.toString());

 

  TestEx2 ex1 = new TestEx2();
  ex1.put("55555");
  System.out.println(ex1.get());

 

 }

 

 public void put(String name) {
  person = new Person(name);
 }

 

 public String get() {
  return person.toString();
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
