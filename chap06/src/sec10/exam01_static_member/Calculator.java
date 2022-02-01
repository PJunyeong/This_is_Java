package sec10.exam01_static_member;

public class Calculator {
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
	// 객체마다 '다른' 특성은 인스턴스 필드/메소드로 선언한다.
	// 객체마다 '같은' 공통적인 기능은 정적 필드/메소드로 선언한다.
}
