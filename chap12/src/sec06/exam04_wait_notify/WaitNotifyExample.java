package sec06.exam04_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
		// 공유 객체의 메소드(동기화 필수) -> notify and wait를 통해 번갈아 실행할 수 있다.
	}

}
