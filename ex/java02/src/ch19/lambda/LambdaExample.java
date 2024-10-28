package ch19.lambda;


public class LambdaExample {

    public static void main(String[] args) {
        action((x,y)-> {
            int res = x + y;
            System.out.println(res);
        });
    }

    public static void action(Calculable calculable) {
        int x=100, y=50;
        calculable.calculate(x, y);
    }
}
