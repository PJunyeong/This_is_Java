package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// int -> char ���� ĳ����
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		// long -> int ���� ĳ����
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// double -> int ���� ĳ����
		
		
	}

}
