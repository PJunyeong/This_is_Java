package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "���ؿ�", "1222", 25, true);
		Member cloned = original.getMember();
		// �ٸ� ��ü������ ���� �����Ͱ� ������ cloned ��ü ��ȯ
		
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
		original.age = 14;
		System.out.println(original.age);
		System.out.println(cloned.age);
	}

}
