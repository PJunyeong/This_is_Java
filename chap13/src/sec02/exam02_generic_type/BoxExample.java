package sec02.exam02_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("���ؿ�");
		String str = box.get();
		System.out.println(str);
		// ���� Ÿ�� ĳ���� ���� �״�� ��ȯ ����
		// int num = box.get();
		// box.get()�� ��ȯ�ϴ� ��ü Ÿ���� String���� �����ȴ�. 
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(123456);
		int int1 = box2.get();
		// box2�� <Integer>�� ���׸� Ÿ�� ����Ͽ��� ������ get���� �ٷ� �����´�.
		System.out.println(int1);
	}

}
