package ch19.thread2;

public class WorkThread extends Thread {
    static boolean work;
    public WorkThread(String name) {
        //super(name);
        super.setName(name);
    }

    public void run() {
        while(true) {
            if(work) {
                System.out.println(getName() + " 작업처리...");
            }
        }
    }

}
