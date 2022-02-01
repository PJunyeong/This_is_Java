package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + " 속도로 달립니다.");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		// main에서 speed 접근하기 위해서 인스턴스로 객체를 만들 필요가 있다.
	}

}
