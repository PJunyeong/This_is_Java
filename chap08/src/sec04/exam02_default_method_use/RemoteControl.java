package sec04.exam02_default_method_use;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// abstract 메소드를 실체 클래스에서 정의한다.
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("Make mute");
		} else {
			System.out.println("Make unmute");
		}
	}
	// default 메소드를 사용하기 위해서는 구현 객체가 필요하다.
	static void changeBattery() {
		System.out.println("Battery changed");
	}
	//static도 자동으로 public으로 간주


}
