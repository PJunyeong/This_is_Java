package sec05.exam03_method_polymoriphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		// �������̽� Ÿ������ ���� �� �Ķ���ͷ� ���޵Ǵ� ��ü �����Ӱ� ���� �����ϴ�.
	}

}
