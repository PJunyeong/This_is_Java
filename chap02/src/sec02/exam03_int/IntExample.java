package sec02.exam03_int;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012;
		System.out.println(var1);
		System.out.println(var2);
		// 8진법 12는 10진법 10이다.
		
		int var3 = 0xA;
		System.out.println(var3);
		// 16진법 A는 10진법 10이다.
		
		long var4 = 10;
		long var5 = 20L;
		//long var6 = 10000000000;
		// 21억 이상 수는 L을 붙여야 long 타입으로 인식된다.
		long var7 = 10000000000L;
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var7);
	}

}
