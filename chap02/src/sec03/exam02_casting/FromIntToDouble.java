package sec03.exam02_casting;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		float num3 = num2;
		num2 = (int) num3;
		int result = num1 - num2;
		System.out.println(result);
		// 0이 아닌 -4가 나온다. 즉 정밀도 손실 발생함.
		num2 = num1;
		double num4 = num2;
		num2 = (int) num4;
		result = num1 - num2;
		System.out.println(result);
		// double 타입을 통해 정밀도 손실이 발생하지 않도록 함.
		
	}

}
