package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "���ؿ�";
		String strVar2 = "���ؿ�";
		
		if (strVar1 == strVar2) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �ٸ�");
		}
		
		String strVar3 = new String("���ؿ�");
		String strVar4 = new String("���ؿ�");
		
		if (strVar3 == strVar4) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �ٸ�");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("���ڿ� ����");
		} else {
			System.out.println("���ڿ� �ٸ�");
		}
		// new�� ���� ���� ������ ��ü�� ���� �ٸ� �޸� �ּҸ� ������.
		
		
	}
	

}
