package sec02.exam01_netstedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		//A.B b = new A.B();
		A.B b = a.new B();
		//B�� A���� ȣ��� �ν��Ͻ� Ŭ�����̹Ƿ� 
		b.method1();
		
		A.C c = new A.C();
		// Ŭ���� C�� ���� Ŭ�����̹Ƿ� �ۿ��� �ٷ� ���� ����.
		c.field1 = 3;
		c.method1();
		c.method2();
		A.C.method2();
		// static�̹Ƿ� ��ü ���� ��ٷ� ���� ����.
		
		a.method();
		// D ��ü ���� ���� X, Ŭ���� A ��ü a�� ���� ���������� ���
	}
	

}
