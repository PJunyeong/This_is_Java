package sec06.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
//		try {
//		while(true) {
//			System.out.println("works");
//			Thread.sleep(1);
//		}} catch(InterruptedException e) {}
//	}
		while(true) {
			System.out.println("works");
			if (Thread.interrupted()) {
				break;
			}
		}
	}
}
