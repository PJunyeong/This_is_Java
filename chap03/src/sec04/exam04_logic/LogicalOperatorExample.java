package sec04.exam04_logic;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		if ((charCode >= 65) & (charCode <=90)){
			System.out.println("Uppercase");
		}
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("Lowercase");
		}
		if (!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 digits");
			//char�� 48 �̻�, 57 ����
		}
		// &, && �������� &&�� ���ڰ� false�� ���ڸ� �˻����� �ʴ´�. ������ �� ������.
		
		int value = 6;
		
		if ((value%2 ==0) | (value%3==0)) {
			System.out.println("2 or 3 multiplied");
		}
		if ((value%2==0) || (value%3==0)) {
			System.out.println("2 or 3 multiplied");
		}
		// |, || �������� ||�� ���ڰ� true�� ���ڸ� �˻����� �ʴ´�. ������ �� ������.
	}

}
