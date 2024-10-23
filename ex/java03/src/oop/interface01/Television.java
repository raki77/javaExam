package oop.interface01;

public class Television implements RemoteControl {  
	
	int volume;
	
	@Override
	public void turnOn() { 
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " + volume);
	}

}
