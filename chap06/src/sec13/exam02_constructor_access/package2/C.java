package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {
	A a1 = new A(true);
	// public 생성자는 같은 패키지가 아니더라도 사용 가능
	// A a2 = new A();
	// default 생성자는 같은 패키지가 아니므로 사용 불가능
	// A a3 = new A("string");
}
