package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	void execute(int x, int y) {
		double result = avg(x, y);
		println("avg: " + result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	// 클래스 내부에서 메소드 호출 시 '이름'만 가지고 호출할 수 있다.
}
