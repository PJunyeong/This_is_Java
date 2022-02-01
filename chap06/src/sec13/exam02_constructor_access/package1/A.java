package sec13.exam02_constructor_access.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("string");
	// A 클래스 내부이므로 모든 경우에서 생성자 호출 가능
	
	public A(boolean b) {}
	// 패키지 상관없이 호출 가능
	A(){}
	// 패키지 내부에서만 호출 가능. default
	private A(String s) {}
	// 클래스 내부에서만 호출 가능.
}
