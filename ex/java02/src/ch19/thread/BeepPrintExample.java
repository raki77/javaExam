package ch19.thread;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {}
                }
            }
        });
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i=0; i<5; i++) {
//            toolkit.beep();
//            Thread.sleep(500);
//        }
//        for(int j=0; j<5; j++) {
//            System.out.println("링링");
//            Thread.sleep(500);
//        }
    }
}
