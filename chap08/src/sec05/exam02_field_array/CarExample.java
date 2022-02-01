package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		// 배열을 통해 관리하면 보다 편리하다.
		
		myCar.run();
	}

}
