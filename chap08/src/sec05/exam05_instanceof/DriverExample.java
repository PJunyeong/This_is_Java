package sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		// vehicle instanceof Bus�� ��ü�� Ȯ���Ͽ��� ������ checkFare ����.
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		// �������̽� Ÿ������ ���� �� �Ķ���ͷ� ���޵Ǵ� ��ü �����Ӱ� ���� �����ϴ�.
	}

}
