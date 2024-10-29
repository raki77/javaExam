package ch19.thread;

public class BeepTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int x=0; x<5; x++) {
                    System.out.println("쓰레드");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            Thread.sleep(1000);
        }
    }
}
