package sec08.exam03_method_call;

public class Car {
	int speed;
	boolean key;
	
	int getSpeed() {
		return this.speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
		this.key = true;
	}
	
	void keyTurnOff() {
		System.out.println("Ű�� ��޴ϴ�.");
		this.key = false;
	}
	void run() {
		if (this.key) {
			System.out.println("���� ����");
			for (int i = 10; i <= 50; i++) {
				this.speed = i;
				System.out.println("�޸��ϴ�. �ü� " + this.speed + "km/h");
			}
		} else {
			System.out.println("Ű�� ��� �ֽ��ϴ�.");
		}
	}
}
