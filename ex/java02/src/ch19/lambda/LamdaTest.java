package ch19.lambda;

public class LamdaTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(()-> {
            System.out.println("AAAAAA");
            System.out.println("AAAAAA");
            System.out.println("AAAAAA");
        });
        person.action(()->
            System.out.println("BBBBBB")
        );
    }
}
