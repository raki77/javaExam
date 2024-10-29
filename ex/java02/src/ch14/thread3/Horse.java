package ch14.thread3;

public class Horse implements Runnable {
    private int horse_num;

    public Horse(int horse_num) {
        this.horse_num = horse_num;
    }

    @Override
    public void run() {
        long sleepTime = (long)(Math.random() *500);
        System.out.println(horse_num + "번 말이 " + sleepTime + "만큼 sleep");
        try {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e) {}
        for(int i=0; i<=10 ; i++) {
            if(horse_num == 8 && i == 5) {
                System.out.println("8말 yield()...");
                Thread.yield();
                try {
                    Thread.sleep(200);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(horse_num + "번 말이 " + 100*i + "미터 도착");
        }
        System.out.println(horse_num + "번 말이 " + "결승 전 도착");
    }
}
