package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGat(50);
		boolean getState = myCar.isLeftGas();
		System.out.println(getState);
		
		if (getState) {
			System.out.println("���");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �����ϼ���");
		}
	}

}
