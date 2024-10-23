package oop.poly5;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		driver(bus);
		driver(taxi);
	}	
	
	public static void driver(Bus bus){
		
	}

	public static void driver(Taxi taxi){
		
	}
}
