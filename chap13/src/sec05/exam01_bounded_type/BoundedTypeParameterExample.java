package sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// int result1 = Util.compare("a", "b");
		// Util.compare �Ķ���ͷ� �� �� �ִ� �Ķ���ʹ� Number�� �ڽ� Ŭ����
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		int result2 = Util.compare(10, -2);
		System.out.println(result2);
	
	}

}
