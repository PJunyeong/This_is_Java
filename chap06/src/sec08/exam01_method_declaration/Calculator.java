package sec08.exam01_method_declaration;

public class Calculator {
	
	boolean power;
	void powerOn() {
		System.out.println("������ �մϴ�.");
		this.power = true;
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
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
