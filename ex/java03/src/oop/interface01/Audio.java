package oop.interface01;

public class Audio implements RemoteControl {

	int volume;
	
	@Override
	public void turnOn() { 
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}	
	
	@Override
	public void setVolume(int volume) {
		// 오류 : volume = 100; volume = -1
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		this.volume = volume;
		System.out.println("현재 Audio 볼륨 : " + volume);
	} 
	// 필드
	private int memoryVolume;

	// 디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제 합니다.");
			setVolume(this.memoryVolume);
		}
	}
	

	
}
