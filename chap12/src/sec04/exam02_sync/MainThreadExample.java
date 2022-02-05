package sec04.exam02_sync;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		// 동기화 이슈가 있는 Calculator 클래스의 setMemory 메소드를 synchronized함으로 JVM이 자동으로 CS로 만든다.
	}

}
