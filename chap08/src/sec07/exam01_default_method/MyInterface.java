package sec07.exam01_default_method;

public interface MyInterface {
	public void method1();
	// public void method2();
	// �������̽����� �߻� Ŭ���� �߰� �� �� �������̽��� implements�ϴ� �ٸ� Ŭ���� ���� �ʿ�
	public default void method2() {
		// default method�� ���� ��� ������.
		System.out.println("MyInterface- default method2");
	}
}
