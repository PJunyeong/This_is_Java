package sec06.exam02_yield;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadB works");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadB does not work");
	}
}
