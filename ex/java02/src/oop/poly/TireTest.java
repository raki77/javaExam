package oop.poly;

public class TireTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.tire1 = new HankookTire();
        myCar.tire1.roll();

//        HankookTire ht = new HankookTire();
//        ht.roll();
//        KumhoTire kt = new KumhoTire();
//        kt.roll();
    }
}
