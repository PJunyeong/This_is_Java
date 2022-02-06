package sec06.exam02_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadA works");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA does not work");
	}
}
