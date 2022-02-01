package sec06.exam01_protected_package1;

public class B {
	public void method() {
		A a = new A();
		// A와 같은 패키지 안에서 선언되었으므로 선언 가능하다.
		a.field = "B에서 호출";
		a.method();
	}
}
