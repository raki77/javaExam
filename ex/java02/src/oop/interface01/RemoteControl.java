package oop.interface01;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);	
	
	// 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제 합니다.");
		}
	}	
	
	static void changeBattery() {
		System.out.println("리모콘 건전지 교환 합니다.");
	}
	
}
