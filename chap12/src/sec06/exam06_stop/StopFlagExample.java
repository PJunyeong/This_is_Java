package sec06.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
		// stop flag를 사용한다 -> 일시 정지 상태를 멈추지는 못한다.
	}
}
