package sec02.exam05_static_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("Make mute");
		} else {
			System.out.println("Make unmute");
		}
	}
	static void changeBattery() {
		System.out.println("Battery changed");
	}
	//static도 자동으로 public으로 간주


}
