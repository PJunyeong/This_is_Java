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
	// Ŭ���� ���ο��� �޼ҵ� ȣ�� �� '�̸�'�� ������ ȣ���� �� �ִ�.
}
