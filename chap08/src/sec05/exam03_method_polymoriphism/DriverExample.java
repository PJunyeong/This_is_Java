package sec05.exam03_method_polymoriphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		// 인터페이스 타입으로 실행 시 파라미터로 전달되는 객체 자유롭게 선택 가능하다.
	}

}
