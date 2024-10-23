package oop.poly;

public class KumhoTire extends Tire {
    @Override
    public void roll() {
        super.roll();
        System.out.println("KumhoTire가 회전 한다.");
    }
}
