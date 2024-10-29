package ch19.thread2;

public class SumThreadTest {
    public static void main(String[] args) {
        SumThread sh = new SumThread();
        sh.start();
        try {
            sh.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1~100합 : " + sh.getSum());
    }
}
