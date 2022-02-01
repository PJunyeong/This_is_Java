package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		//다른 패키지 접근이므로 default, private 사용 불가능
		
		a.method1();
		//a.method2();
		//a.method3();
		//필드, 메소드를 다른 패키지에서 접근할 때에는 public만 사용 가능하다.
	}

}
