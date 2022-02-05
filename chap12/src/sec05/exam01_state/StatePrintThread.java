package sec05.exam01_state;

public class StatePrintThread extends Thread{
	// TargetThread�� state�� ���������� ����Ѵ�.
	private Thread targetThread;
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
		// ���� �� targetThread�� ����
	}
	@Override
	public void run() {
		while(true) {
		Thread.State state = targetThread.getState();
		System.out.println("targetThread-State: " + state);
		if (state == Thread.State.NEW) {
			targetThread.start();
			// ó�� ���� �� start (run �޼ҵ带 ����)
		}
		if (state == Thread.State.TERMINATED) {
			break;
			// ��� ���� ��� while�� ���������� ����
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
		}
	}
}
