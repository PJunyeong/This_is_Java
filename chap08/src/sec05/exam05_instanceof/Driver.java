package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			((Bus) vehicle).checkFare();
			// Bus 타입이라면 casting 이후 checkFare.
		}
		vehicle.run();
		// 파라미터의 다형성
	}
}
