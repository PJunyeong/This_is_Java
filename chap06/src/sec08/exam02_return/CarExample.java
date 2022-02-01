package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGat(50);
		boolean getState = myCar.isLeftGas();
		System.out.println(getState);
		
		if (getState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("가스 존재");
		} else {
			System.out.println("가스 주입하세요");
		}
	}

}
