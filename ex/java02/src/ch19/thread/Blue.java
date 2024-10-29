package ch19.thread;

public class Blue extends Thread {
//    public void blueFlag() {
//    }
    @Override
    public void run() {
        while(true) {
            System.out.println("청기");
        }
    }
}
