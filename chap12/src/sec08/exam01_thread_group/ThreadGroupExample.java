package sec08.exam01_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		// main 그룹 하위 그룹에 myGroup이 생성된다.
		// myGroup 밑에 workThread A, B를 포함시킨다.
		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("main 스레드 내 모든 메소드 출력 내용");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		// main 스레드 그룹 내 상태를 출력한다.
		
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("myGroup 스레드 그룹의 interrupt 메소드 호출");
		myGroup.interrupt();
		//workThreadA, B 모두 인터럽트가 한꺼번에 된다!
	}

}
