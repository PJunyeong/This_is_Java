package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "박준영";
		String strVar2 = "박준영";
		
		if (strVar1 == strVar2) {
			System.out.println("참조 동일");
		} else {
			System.out.println("참조 다름");
		}
		
		String strVar3 = new String("박준영");
		String strVar4 = new String("박준영");
		
		if (strVar3 == strVar4) {
			System.out.println("참조 동일");
		} else {
			System.out.println("참조 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("문자열 동일");
		} else {
			System.out.println("문자열 다름");
		}
		// new를 통해 새로 생성한 객체는 서로 다른 메모리 주소를 가진다.
		
		
	}
	

}
