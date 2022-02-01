package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		 byte byteValue = 10;
		 int intValue = byteValue;
		 // 자동 캐스팅
		 System.out.println(intValue);
		 
		 char charValue = '가';
		 intValue = charValue;
		 // 자동 캐스팅
		 System.out.println(intValue);
		 
		 intValue = 500;
		 long longValue = intValue;
		 // 자동 캐스팅
		 System.out.println(longValue);
		 
		 intValue = 200;
		 double doubleValue = intValue;
		 // 자동 캐스팅
		 System.out.println(doubleValue);
		 
		 longValue = 10000000000L;
		 float floatValue = longValue;
		 // long 타입도 float 타입에 속한다. 바이트 크기가 다르지만 실수 포함 범위가 더 크다.
		 System.out.println(floatValue);
	}

}
