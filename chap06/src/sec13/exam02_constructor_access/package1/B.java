package sec13.exam02_constructor_access.package1;

public class B {
	A a1 = new A(true);
	A a2 = new A();
	// B가 같은 패키지이므로 default 설정의 생성자 호출 가능
	// A a3 = new A("string");
	// private 생성자이므로 B 클래스에서는 호출 불가능

}
