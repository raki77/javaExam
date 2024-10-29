package ch19.thread;

public class White extends Thread {
//    public void whiteFlag() {
//    }
    @Override
    public void run() {
        while(true) {
            System.out.println("백기");
        }
    }
}
