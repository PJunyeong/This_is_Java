package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// override�� method2()�� ȣ��ȴ�.
		// parent.method3();
		// parent Ÿ���̹Ƿ� child���� �ִ� method3�� ����� �� ����.
	}

}
