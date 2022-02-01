package sec07.exam03_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 0:
				System.out.println("it drives well");
				break;
			case 1:
				System.out.println("FL -> Hankook Tire");
				car.frontLeftTire = new HankookTire("FL", 10);
			case 2:
				System.out.println("FR -> Kumho Tire");
				car.frontRightTire = new KumhoTire("FR", 12);
			case 3:
				System.out.println("BL -> Hankook Tire");
				car.backLeftTire = new HankookTire("BL", 10);
			case 4:
				System.out.println("BR -> Kumho Tire");
				car.backRightTire = new KumhoTire("BR", 12);
			}
		}
	}

}
