package sec02.exam01_netstedclass_object;

public class A {
	A(){
		System.out.println("A obj created");
	}
	class B{
		int field1;
		static int field2;
		// 인스턴스 클래스 내 static 변수는 원래 불가능했다.
		B(){
			System.out.println("B obj created");
		}
		void method1() {
			System.out.println("B-method1");
		}
	}
	static class C{
		int field1;
		static int field2;
		C(){
			System.out.println("C obj created");
		}
		
		void method1() {
			System.out.println("C-method1");
		}
		static void method2() {
			System.out.println("C-method2");
		}
	}
	
	// 메소드를 통해 로컬 클래스를 선언한다.
	void method() {
		class D{
			int field1;
			D(){
				System.out.println("D obj created");
			}
			void method1() {
				System.out.println("D-method1");
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
		// 로컬 클래스 D는 메소드를 벗어나서 사용 불가능. 즉 메인에서 사용 불가능.
	}
	
	
}
