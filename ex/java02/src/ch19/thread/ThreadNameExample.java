package ch19.thread;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        for(int x=0 ; x<3 ; x++) {
            Thread thread = new Thread(){
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            thread.start();
        }

        Thread chatThread = new Thread() {
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("chat thread");
        chatThread.start();
    }
}
