package sec07.exam03_polymorphism;

public class Car {
	Tire frontLeftTire = new Tire("FL", 6);
	Tire frontRightTire = new Tire("FR", 2);
	Tire backLeftTire = new Tire("BL", 4);
	Tire backRightTire = new Tire("BR", 5);
	
	int run() {
		System.out.println("Car drives");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("Car stops");
	}
}
