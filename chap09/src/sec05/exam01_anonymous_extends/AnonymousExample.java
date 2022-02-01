package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.wake();
		anonymous.method1();
		
		anonymous.method2(new Person() {
			String studentNo;
			void shower() {
				System.out.println("Go to take a shower");
			}
			@Override
			void wake() {
				System.out.println("Wake up in the evening");
				shower();
				// 새로 추가된 필드 및 메소드를 추가해서 사용할 수 있다.
			};
		});
	};
	

}
