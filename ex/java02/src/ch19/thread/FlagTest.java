package ch19.thread;

public class FlagTest {
    public static void main(String[] args) {
        White white = new White();
        Blue blue = new Blue();
        white.start();
        blue.start();
    }
}
