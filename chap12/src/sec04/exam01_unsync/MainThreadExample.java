package sec04.exam01_unsync;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		// user2에서 setMemory한 50이 user1의 메소드 실행에서도 나온다 -> 동기화 오류
	}

}
