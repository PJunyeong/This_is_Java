package sec02.exam02_constant_field;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// 자동으로 변수 -> 상수 선언된다.
	
	// interface cannot define initializer
}
