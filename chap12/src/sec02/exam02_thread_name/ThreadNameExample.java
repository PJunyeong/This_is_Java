package sec02.exam02_thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("main thread name: "+ thread.getName());
		Thread threadA = new ThreadA();
		System.out.println("Thread_A ���� ������: " + Thread.currentThread());
		threadA.start();
		// start�� �� �� ���� ȣ�� ����. �ٽ� �� �� �����带 ������ �Ѵ�.
		Thread threadB = new ThreadB();
		System.out.println("Thread_B ���� ������: " + Thread.currentThread());

		threadB.start();
	}

}
