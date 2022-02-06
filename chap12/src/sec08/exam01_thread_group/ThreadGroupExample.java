package sec08.exam01_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		// main �׷� ���� �׷쿡 myGroup�� �����ȴ�.
		// myGroup �ؿ� workThread A, B�� ���Խ�Ų��.
		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("main ������ �� ��� �޼ҵ� ��� ����");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		// main ������ �׷� �� ���¸� ����Ѵ�.
		
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("myGroup ������ �׷��� interrupt �޼ҵ� ȣ��");
		myGroup.interrupt();
		//workThreadA, B ��� ���ͷ�Ʈ�� �Ѳ����� �ȴ�!
	}

}
