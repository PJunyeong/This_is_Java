package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// int -> char 강제 캐스팅
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		// long -> int 강제 캐스팅
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// double -> int 강제 캐스팅
		
		
	}

}
