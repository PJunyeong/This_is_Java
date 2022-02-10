package sec05.exam01_runnable;

public class RunnableExample {

	public static void main(String[] args) {
//		Runnable runnable = () -> {
//			for (int i = 0; i <10; i++) {
//				System.out.println(i);
//				
//			}
//		};
//		Thread thread = new Thread(runnable);
//		thread.start();
		// Runnable 익명 구현 객체 -> 사용 잘 안 한다.
		
		Thread thread = new Thread(() ->{
			for (int i =0; i <10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
		// thread에 직접 람다식으로 넘겨준다. 잘 쓰이는 방식이다.
	}

}
