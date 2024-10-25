package oop.poly;

public class Car {
	
    Tire tire1, tire2;

    public Car() {
        tire1 = new HankookTire();
        tire2 = new KumhoTire();
    }
    
    public Car(Tire tire1) {
    	this.tire1 = tire1;
    }
    public Car(Tire tire1, Tire tire2) {
    	this.tire1 = tire1;
    	this.tire2 = tire2;
    }

    public Tire getTire2() {
        return tire2;
    }

    public void setTire2(Tire tire2) {
        this.tire2 = tire2;
    }

    public Tire getTire() {
        return tire1;
    }

    public void setTire(Tire tire1) {
        this.tire1 = tire1;
    }

}
