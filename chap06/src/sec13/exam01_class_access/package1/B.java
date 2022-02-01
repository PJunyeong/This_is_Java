package sec13.exam01_class_access.package1;

import sec13.exam01_class_access.package2.C;

class B {
	A a = new A();
	C c = new C();
	// 다른 패키지 C는 public이므로 B에서 사용할 수 있다.
}
