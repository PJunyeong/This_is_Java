package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("��� �� �� - 0.7 ������ ����");
		System.out.println(result + "������ ���´�.");
		// �Ǽ� ���
		
		int temp = apple*10 - number;
		double result2 = temp/10.0;
		
		System.out.println(result2);
		// int�� ����� ����� �� �Ǽ��� ������ ����Ѵ�.
		
	}

}
