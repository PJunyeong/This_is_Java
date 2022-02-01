package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		// myCar.speed = 10;
		// myCar.stop = false;
		// speed, stop은 private이므로 외부에서 직접적으로 접근 불가능.
		// 메소드를 사용해서 접근한다.
		
		myCar.setSpeed(100);
		System.out.println(myCar.getSpeed());
		myCar.setStop(false);
		System.out.println(myCar.isStop());
		myCar.setSpeed(-70);
		System.out.println(myCar.getSpeed());
		//setter를 통해 사전에 파라미터를 체크할 수 있다.
	
	}

}
