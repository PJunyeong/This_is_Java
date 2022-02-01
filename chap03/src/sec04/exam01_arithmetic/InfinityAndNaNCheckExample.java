package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		// Divide by zero -> ArithmeticException
		double z = 5/y;
		System.out.println(Double.isInfinite(z));
		// double 0.0���� ������ �������� ������ infinite ��ȯ
		double z2 = 5 % y;
		System.out.println(Double.isNaN(z2));
		// double 0.0���� ������ ���� ���� NaN�̴�.
		System.out.println(z + 2);
		// Infinity + number = Infinity or NaN + number = NaN.
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ���");
		} else {
			System.out.println(z+2);
		}
		
		int x2 = 5;
		int y2 = 0;
		// int z3 = x/y; ArithmeticException �߻�. try�� catch����.
		
		try {
			int z3 = x2/y2;
			System.out.println("z=" + z);
		} catch(ArithmeticException e) {
			System.out.println("���� �Ұ���");
		}
	}

}
