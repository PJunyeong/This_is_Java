package sec08.exam01_method_declaration;

public class Calculator {
	
	boolean power;
	void powerOn() {
		System.out.println("전원을 켭니다.");
		this.power = true;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
		this.power = false;
	}
	
	int plus(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int multiply(int x, int y) {
		return x * y;
	}
	double divide(int x, int y) {
		return (double) x / y;
	}

}
