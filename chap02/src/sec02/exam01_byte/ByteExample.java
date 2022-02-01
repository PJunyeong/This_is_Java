package sec02.exam01_byte;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = 125;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; byte 범위 오버 플로우
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		byte num1 = 125;
		int num2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("num1: " + num1 + "\t num2: " + num2);
		}
	}

}
