package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			((Bus) vehicle).checkFare();
			// Bus Ÿ���̶�� casting ���� checkFare.
		}
		vehicle.run();
		// �Ķ������ ������
	}
}
