package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�ſ��";
		String strVar2 = "�ſ��";
		String strVar3 = new String("�ſ��");
		// String Ŭ������ "�ſ��"�� �Ķ���ͷ� �Ѱ��� new ��ü ����.
		// new ��ü�� ������ strVar3�� �����Ѵ�.
		boolean result1 = (strVar1 == strVar2);
		boolean result2 = (strVar1 == strVar3);
		// new�� ������ ���ο� ������ �����ϴ� strVar3�� strVar�� �ٸ� ������ �����Ѵ�.
		boolean result3 = strVar1.equals(strVar2);
		boolean result4 = strVar1.equals(strVar3);
		// ���� ������ �ƴ� ���ڿ��� ���ϼ� ���θ� Ȯ���Ѵ�.
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
