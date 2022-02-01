package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		// interface 전달하는 파라미터 객체가 변경되었으므로 KumhoTire class가 전달된다.
		// 다형성.
		
		myCar.run();
	}

}
