package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA's task");
		notify();
		// ���� wait�� �����带 �����Ų��.
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB's task");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}
}
