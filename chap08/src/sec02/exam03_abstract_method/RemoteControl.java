package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// interface 메소드는 자동으로 컴파일러에 의해 abstract로 처리된다.
}
