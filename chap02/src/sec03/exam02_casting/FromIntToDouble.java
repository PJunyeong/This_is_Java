package sec03.exam02_casting;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		float num3 = num2;
		num2 = (int) num3;
		int result = num1 - num2;
		System.out.println(result);
		// 0�� �ƴ� -4�� ���´�. �� ���е� �ս� �߻���.
		num2 = num1;
		double num4 = num2;
		num2 = (int) num4;
		result = num1 - num2;
		System.out.println(result);
		// double Ÿ���� ���� ���е� �ս��� �߻����� �ʵ��� ��.
		
	}

}
