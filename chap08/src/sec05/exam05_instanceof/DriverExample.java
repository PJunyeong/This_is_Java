package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		// vehicle instanceof Bus로 객체를 확인하였기 때문에 checkFare 실행.
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		// 인터페이스 타입으로 실행 시 파라미터로 전달되는 객체 자유롭게 선택 가능하다.
	}

}
