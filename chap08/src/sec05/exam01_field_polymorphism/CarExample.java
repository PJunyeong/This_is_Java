package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		// interface �����ϴ� �Ķ���� ��ü�� ����Ǿ����Ƿ� KumhoTire class�� ���޵ȴ�.
		// ������.
		
		myCar.run();
	}

}
