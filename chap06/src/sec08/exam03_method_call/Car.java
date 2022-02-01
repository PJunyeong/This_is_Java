package sec08.exam03_method_call;

public class Car {
	int speed;
	boolean key;
	
	int getSpeed() {
		return this.speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
		this.key = true;
	}
	
	void keyTurnOff() {
		System.out.println("키를 잠급니다.");
		this.key = false;
	}
	void run() {
		if (this.key) {
			System.out.println("주행 시작");
			for (int i = 10; i <= 50; i++) {
				this.speed = i;
				System.out.println("달립니다. 시속 " + this.speed + "km/h");
			}
		} else {
			System.out.println("키가 잠겨 있습니다.");
		}
	}
}
