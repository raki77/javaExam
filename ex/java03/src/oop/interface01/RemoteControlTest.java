package oop.interface01;

public class RemoteControlTest {

	public static void main(String[] args) {		
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
				
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);		
		
		RemoteControl.changeBattery();
		System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
		
	}

}
