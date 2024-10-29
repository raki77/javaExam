package ch14.thread3;

public class SyncronizedExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread ut1 = new User1Thread();
        ut1.setCalculator(calculator);
        ut1.start();

        User2Thread ut2 = new User2Thread();
        ut2.setCalculator(calculator);
        ut2.start();
    }
}
