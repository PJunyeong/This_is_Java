package sec02.exam03_int;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012;
		System.out.println(var1);
		System.out.println(var2);
		// 8���� 12�� 10���� 10�̴�.
		
		int var3 = 0xA;
		System.out.println(var3);
		// 16���� A�� 10���� 10�̴�.
		
		long var4 = 10;
		long var5 = 20L;
		//long var6 = 10000000000;
		// 21�� �̻� ���� L�� �ٿ��� long Ÿ������ �νĵȴ�.
		long var7 = 10000000000L;
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var7);
	}

}
