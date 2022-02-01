package sec03.exam02_field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			// 클래스 B에서 A에 접근 가능하다. 
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method() {
			//field1 = 10;
			//field1은 A 객체가 생성되어야 하는데 static은 A 없이도 선언 가능하다.
			field2 = 10;
			method2();
			//static으로 선언된 필드, 메소드만 선언 가능하다. 
		}
	}
}
