package sec05.exam01_anonymous_extends;

public class Anonymous {
	Person field = new Person() {
		String studentNo;
		void work() {
			System.out.println("Go to work");
		}
		@Override
		void wake() {
			System.out.println("Wake up in the noon");
			work();
			// ���� �߰��� �ʵ� �� �޼ҵ带 �߰��ؼ� ����� �� �ִ�.
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("Go to walk");
			}
			@Override
			void wake() {
				System.out.println("Wake up in the afternoon");
				walk();
			};
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
		
	}
}
