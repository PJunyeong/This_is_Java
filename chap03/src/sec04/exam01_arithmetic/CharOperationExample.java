package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; ��� ������ �⺻�� int�̹Ƿ� ���� ĳ������ �ʿ��ϴ�.
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) (c2 + 1);
		// ���� ĳ������ ���� int�� char�� ��ȯ�Ѵ�.
		System.out.println(c3);
	}

}
