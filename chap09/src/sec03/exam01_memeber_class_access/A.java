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
	// B�� �����Ǳ� ���ؼ��� A�� �ʿ��ϴ�.
	static C field4 = new C();
	
	// static method
	static void method2() {
		// B var1 = new B();
		// B ��ü�� �ν��Ͻ� ��ü A�� �ʿ��ϹǷ� ������ �� ����.
		C var2 = new C();
	}
}
