package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		//vehicle.checkFare();
		//vehicle�� Bus'��' ������ �ִ� �޼ҵ带 ����� �� ����.
		
		Bus bus = (Bus) vehicle;
		// casting�� ���� Bus�� ĳ����. Bus�� �޼ҵ� ��� ����.
		bus.checkFare();
		bus.run();
	}

}
