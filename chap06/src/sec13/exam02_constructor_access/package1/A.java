package sec13.exam02_constructor_access.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("string");
	// A Ŭ���� �����̹Ƿ� ��� ��쿡�� ������ ȣ�� ����
	
	public A(boolean b) {}
	// ��Ű�� ������� ȣ�� ����
	A(){}
	// ��Ű�� ���ο����� ȣ�� ����. default
	private A(String s) {}
	// Ŭ���� ���ο����� ȣ�� ����.
}
