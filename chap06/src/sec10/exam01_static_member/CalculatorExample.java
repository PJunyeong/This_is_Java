package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println(Calculator.pi);
		// static �ʵ�/�޼ҵ�� �ν��Ͻ��� �ƴ϶� Ŭ���� ������ ���� Ŭ�������� �����Ѵ�.
		System.out.println(Calculator.plus(10, 500));
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
