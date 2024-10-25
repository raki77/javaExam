package oop.poly;

public class TireTest {
	
    public static void main(String[] args) {
    	
//        Car myCar = new Car();
//        myCar.tire1 = new HankookTire();
//        myCar.tire1.roll();
//        myCar.tire2 = new KumhoTire();
//        myCar.tire2.roll();       

//        Car myCar2 = new Car(new KumhoTire());
//        myCar2.tire1.roll();
        
//        HankookTire ht = new HankookTire();
//        ht.roll();
//        KumhoTire kt = new KumhoTire();
//        kt.roll();
        
        HankookTire ht2 = new HankookTire();
        KumhoTire kt2 = new KumhoTire();
        Car myCar2 = new Car(ht2, kt2);
        myCar2.tire1.roll();
        myCar2.tire2.roll();
        
    }
}
