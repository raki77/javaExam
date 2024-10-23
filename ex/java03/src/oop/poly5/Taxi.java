package oop.poly5;

public class Taxi implements Vehicle {

	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void checkFare(int min) {
		System.out.println("Taxi 요금 계산");
	}

}
