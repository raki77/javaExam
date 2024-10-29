package ch19.thread2;

public class WorkThreadTest {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("shjungA");
        WorkThread workThreadB = new WorkThread("shjungB");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
            workThreadA.work = false;
        }
        catch (Exception e) {}

        try {
            Thread.sleep(5000);
            workThreadA.work = true;
        }
        catch (Exception e) {}

    }
}
