package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		// myCar.speed = 10;
		// myCar.stop = false;
		// speed, stop�� private�̹Ƿ� �ܺο��� ���������� ���� �Ұ���.
		// �޼ҵ带 ����ؼ� �����Ѵ�.
		
		myCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		myCar.setStop(false);
		System.out.println(myCar.isStop());
		myCar.setSpeed(-70);
		System.out.println(myCar.getSpeed());
		//setter�� ���� ������ �Ķ���͸� üũ�� �� �ִ�.
	
	}

}
