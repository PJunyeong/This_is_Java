package sec04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
		int result = safeAdd(2000, 2000);
		System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Due to Overflow, computation undone.");
		}
		// Python의 try except와 동일
	}
	
	public static int safeAdd(int left, int right) {
		if (right > 0 ){
			if (left > Integer.MAX_VALUE - right) {
				System.out.println("throw!");
				throw new ArithmeticException("Overflow occurs");
				
			}} else {
				if (left < Integer.MIN_VALUE -right) {
					throw new ArithmeticException("Overflow occurs");
				}
			} // 예외를 발생시키는 throw 구문
		return left + right;
	}

}
