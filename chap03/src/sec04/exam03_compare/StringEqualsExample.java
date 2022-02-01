package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		String strVar3 = new String("신용권");
		// String 클래스에 "신용권"을 파라미터로 넘겨준 new 객체 생성.
		// new 객체의 번지를 strVar3에 저장한다.
		boolean result1 = (strVar1 == strVar2);
		boolean result2 = (strVar1 == strVar3);
		// new로 생성된 새로운 번지를 참조하는 strVar3은 strVar과 다른 번지를 참조한다.
		boolean result3 = strVar1.equals(strVar2);
		boolean result4 = strVar1.equals(strVar3);
		// 번지 참조가 아닌 문자열의 동일성 여부를 확인한다.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
