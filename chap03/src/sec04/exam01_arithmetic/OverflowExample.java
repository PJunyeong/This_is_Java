package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = x;
		int z = x * y;
		System.out.println(z);
		// int 값 21억을 초과한 garbage 값이 출력된다.
		
		long x2 = x;
		long y2 = x2;
		long z2 = x2 * y2;
		System.out.println(z2);
	}

}
