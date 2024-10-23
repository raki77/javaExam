package oop.poly5;

public class Driver {
	void drive(Vehicle vehicle) {
//		if(vehicle instanceof Bus bus) {			
//			bus.checkFare();
//			vehicle.run();
//		}
		if(vehicle instanceof Bus) {			
			Bus bus = (Bus)vehicle;
			bus.checkFare(30);			
		}	
		else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi)vehicle;
			taxi.checkFare(30);
		}
		vehicle.run();
	}
}
