package sec07.exam02_field_initialization;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("���ؿ�", "980202");
		Korean k2 = new Korean("���ؿ�", "980203");
		System.out.println("k1's name: " + k1.name);
		System.out.println("k1's ssn: " + k1.ssn);
		System.out.println("k2's name: " + k2.name);
		System.out.println("k2's ssn: " + k2.ssn);
		// �����ڸ� ȣ���ϸ鼭 �ʵ忡 �ʱⰪ�� �Ķ���ͷ� �ش�.
		// ���� �ٸ� new ��ü�� �ν��Ͻ�ȭ�Ͽ����Ƿ� ��ü �ּ� �ٸ���.
		System.out.println("k1 == k2?: " + (k1 == k2));
		
	}

}
