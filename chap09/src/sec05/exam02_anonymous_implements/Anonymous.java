package sec05.exam02_anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("turn On");
		}

		@Override
		public void turnOff() {
			System.out.println("turn Off");
		}
		// 인터페이스에 정의된 추상 메소드를 재정의한다.
		
	};
	// 필드에서 익명 구현 객체 선언 가능
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("method turn On");
			}

			@Override
			public void turnOff() {
				System.out.println("method turn Off");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		// 들어온 매개값의 메소드를 실행한다. 
		// method2를 실행할 때 override한 함수를 실행한다.
	}
	
	
}
