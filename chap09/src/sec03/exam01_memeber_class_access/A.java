package sec03.exam01_memeber_class_access;

public class A {
	class B{}
	static class C{}
	
	//instance field
	B field1 = new B();
	C field2 = new C();
	
	//instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// static field
	// static B field3 = new B();
	// B가 생성되기 위해서는 A가 필요하다.
	static C field4 = new C();
	
	// static method
	static void method2() {
		// B var1 = new B();
		// B 객체는 인스턴스 객체 A가 필요하므로 실행할 수 없다.
		C var2 = new C();
	}
}
