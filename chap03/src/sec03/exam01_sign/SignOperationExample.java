package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
		int x = -100;
		int result = +x;
		System.out.println(result);
		result = -x;
		System.out.println(result);
		
		short s = 100;
		int result2 = -s;
		System.out.println(result2);
		// 부호연산자 시 int 값이 나온다.
	}

}
