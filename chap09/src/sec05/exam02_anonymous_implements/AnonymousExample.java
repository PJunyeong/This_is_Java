package sec05.exam02_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("method2 turn On");
			}

			@Override
			public void turnOff() {
				System.out.println("method2 turn Off");
			}
		});
		//method2를 실행할 때 넘겨주는 파라미터 자체를 main에서 정의한다.
	}

}
