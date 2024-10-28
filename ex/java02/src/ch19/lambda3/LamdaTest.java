package ch19.lambda3;

public class LamdaTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x, y) -> {
            double res = x + y;
            return res;
        });
    }
}
