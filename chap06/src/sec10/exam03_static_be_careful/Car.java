package sec10.exam03_static_be_careful;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + " �ӵ��� �޸��ϴ�.");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		// main���� speed �����ϱ� ���ؼ� �ν��Ͻ��� ��ü�� ���� �ʿ䰡 �ִ�.
	}

}
