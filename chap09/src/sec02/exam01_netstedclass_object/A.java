package sec02.exam01_netstedclass_object;

public class A {
	A(){
		System.out.println("A obj created");
	}
	class B{
		int field1;
		static int field2;
		// �ν��Ͻ� Ŭ���� �� static ������ ���� �Ұ����ߴ�.
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
	
	// �޼ҵ带 ���� ���� Ŭ������ �����Ѵ�.
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
		// ���� Ŭ���� D�� �޼ҵ带 ����� ��� �Ұ���. �� ���ο��� ��� �Ұ���.
	}
	
	
}
