package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		//�ٸ� ��Ű�� �����̹Ƿ� default, private ��� �Ұ���
		
		a.method1();
		//a.method2();
		//a.method3();
		//�ʵ�, �޼ҵ带 �ٸ� ��Ű������ ������ ������ public�� ��� �����ϴ�.
	}

}
