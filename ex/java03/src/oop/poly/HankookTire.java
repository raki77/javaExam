package oop.poly;

public class HankookTire extends Tire {
    @Override
    public void roll() {
        super.roll();
        System.out.println("HankookTire가 회전 한다.");
    }
}
