package oop.poly5;

public class Bus implements Vehicle {

	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare(int min) {
		System.out.println("Bus 요금 계산");
		// sum += fare;
	}

}
