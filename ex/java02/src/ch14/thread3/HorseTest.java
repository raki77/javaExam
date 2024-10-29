package ch14.thread3;

public class HorseTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Horse(1));
        Thread t2 = new Thread(new Horse(2));
        Thread t3 = new Thread(new Horse(3));
        Thread t4 = new Thread(new Horse(4));
        Thread t5 = new Thread(new Horse(5));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
