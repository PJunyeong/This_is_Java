package sec02.exam02_thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("main thread name: "+ thread.getName());
		Thread threadA = new ThreadA();
		System.out.println("Thread_A 생성 스레드: " + Thread.currentThread());
		threadA.start();
		// start는 단 한 번만 호출 가능. 다시 한 번 스레드를 만들어야 한다.
		Thread threadB = new ThreadB();
		System.out.println("Thread_B 생성 스레드: " + Thread.currentThread());

		threadB.start();
	}

}
