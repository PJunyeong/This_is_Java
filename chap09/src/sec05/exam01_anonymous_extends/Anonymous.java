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
			// 새로 추가된 필드 및 메소드를 추가해서 사용할 수 있다.
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
