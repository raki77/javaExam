package ch19.lambda2;

public class LamdaTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.action1((name, job) -> {
            System.out.println("--------------------");
            System.out.println("이름: " + name);
            System.out.println("직업: " + job);
            System.out.println("--------------------");
        });
    }
}
