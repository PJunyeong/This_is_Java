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
		// �������̽��� ���ǵ� �߻� �޼ҵ带 �������Ѵ�.
		
	};
	// �ʵ忡�� �͸� ���� ��ü ���� ����
	
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
		// ���� �Ű����� �޼ҵ带 �����Ѵ�. 
		// method2�� ������ �� override�� �Լ��� �����Ѵ�.
	}
	
	
}
