package sec07.exam01_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		// default �޼ҵ带 ���� ���� ���ϰ� �ٸ� �������̽� implements�ϴ� Ŭ������ ����ȴ�.
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}

}
