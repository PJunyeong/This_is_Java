package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		//vehicle.checkFare();
		//vehicle은 Bus'만' 가지고 있는 메소드를 사용할 수 없다.
		
		Bus bus = (Bus) vehicle;
		// casting을 통해 Bus로 캐스팅. Bus의 메소드 사용 가능.
		bus.checkFare();
		bus.run();
	}

}
