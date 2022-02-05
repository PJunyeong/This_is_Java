package sec05.exam01_state;

public class StatePrintThread extends Thread{
	// TargetThread의 state를 지속적으로 출력한다.
	private Thread targetThread;
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
		// 생성 시 targetThread를 저장
	}
	@Override
	public void run() {
		while(true) {
		Thread.State state = targetThread.getState();
		System.out.println("targetThread-State: " + state);
		if (state == Thread.State.NEW) {
			targetThread.start();
			// 처음 생성 시 start (run 메소드를 실행)
		}
		if (state == Thread.State.TERMINATED) {
			break;
			// 모두 끝난 경우 while을 빠져나가기 위함
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {}
		}
	}
}
