package ch19.lambda3;

public class Person {
     public void action(Calcuable cal) {
          double res = cal.calc(50, 30);
          System.out.println(res);
     }
}
