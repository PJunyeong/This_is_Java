package sec12.exam01_wrapper;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println(value);
		
		int result = obj + 100;
		// obj 안의 값이 자동으로 언박싱되서 계산된다.
		System.out.println(result);
		
	}

}
