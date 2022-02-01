package sec07.exam05_method_polymoriphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		// 자식 객체도 받을 수 있다.
	}

}
