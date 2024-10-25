package oop.anonymous;

public class Car {
	
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
    	public void roll() {
			System.out.println("익명 자식1...");
		}
    };
    
    public void run1() {
    	tire1.roll();
    }
    public void run2() {
    	Tire _tire = new Tire() {
    		public void roll() {
    			System.out.println("익명 자식2...");
    		}
    	};
    	_tire.roll();
    }
    public void run3(Tire tire) {
    	tire.roll();
    }
    
}
