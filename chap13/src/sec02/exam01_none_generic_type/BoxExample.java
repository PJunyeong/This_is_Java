package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("���ؿ�");
		String str = (String) box.get();
		// �ֻ��� Ÿ�� Object�� String���� ���� ĳ�����ؾ� �Ѵ�
		// -> ���ʿ��� ���ҽ� ��ȯ ������ �ӵ� ����!
		System.out.println("box.get(): " + str);
		box.set(new Apple());
		// Object�� �� � ��ü�� ���� �� �ִ�. String, class �� ��� ���� ����!
		// �پ��� ��ü ������ ���������� Ÿ�� ��ȯ���� ���� ������尡 ũ��.
		Apple apple = (Apple) box.get();
		
		
	}

}
