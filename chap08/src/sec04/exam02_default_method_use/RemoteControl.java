package sec04.exam02_default_method_use;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// abstract �޼ҵ带 ��ü Ŭ�������� �����Ѵ�.
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("Make mute");
		} else {
			System.out.println("Make unmute");
		}
	}
	// default �޼ҵ带 ����ϱ� ���ؼ��� ���� ��ü�� �ʿ��ϴ�.
	static void changeBattery() {
		System.out.println("Battery changed");
	}
	//static�� �ڵ����� public���� ����


}
