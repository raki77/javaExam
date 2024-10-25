package ch18.obj1;

class MyThread extends Thread {
    private String threadName;
    private static final Object lock = new Object(); // 스레드 간 동기화를 위한 객체

    MyThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        synchronized(lock) { // 동기화 블록으로 출력이 순차적으로 진행되도록 함
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                try {
                    Thread.sleep(500); // 500ms 동안 대기
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                }
            }
            System.out.println(threadName + " finished.");
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // 두 개의 스레드 생성
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // 스레드 실행
        thread1.start();
        thread2.start();

        // 메인 스레드 메시지 출력
        System.out.println("Main thread finished.");
    }
}
