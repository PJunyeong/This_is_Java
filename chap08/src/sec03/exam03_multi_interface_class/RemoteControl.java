package sec03.exam03_multi_interface_class;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// abstract �޼ҵ带 �͸� ���� ��ü�� ������.
	
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
	//static�� �ڵ����� public���� ����


}
