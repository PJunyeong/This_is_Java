package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;
		// var1�� 10���� 10�� �����Ѵ�.
		System.out.println(var1);
		
		int var2 = 010;
		// var2�� 8���� 10�� �����Ѵ�.
		System.out.println(var2);
		
		int var3 = 0x10;
		// var3�� 16���� 10�� �����Ѵ�.
		System.out.println(var3);
		
		double var4 = 0.25;
		// var4�� 0.25 ����
		System.out.println(var4);
		
		double var5 = 2E5;
		//������ ���� 2 * 10^5
		System.out.println(var5);
		
		char var6 = 'A';
		// �����ڵ�� ���ڸ� ����Ѵ�. 
		System.out.println(var6);
		
		char var7 = '��';
		System.out.println(var7);
		
		System.out.println('\t' + "�鿩����");
		System.out.println("����" + '\n' + "�α�");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("�̰��� " + '\"' + "�߿�" + '\"' + "�մϴ�");
		System.out.println("������" + '\\' + "100�����Դϴ�");
		
		char var8 = '\u0041';
		// �����ڵ�� 16���� ���� �Է��Ѵ�.
		// 64 + 1 = 65
		
		System.out.println("����" + "�α�");
		System.out.println("Java" + 8);
		
		String var9 = "Java";
		boolean var10 = true;
		// �� ���� �Ҹ��� ���� var10�� �����Ѵ�.
		System.out.println(var10);
		
		
		
		
	}
}
