package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// private���� ���ο� ��ü ������ ������ ���������Ƿ� singleton�� return�ϴ� ��ü�� ��� ����.
		
		System.out.println("obj1 == obj2 ?: " + (obj1 == obj2));
	}

}
