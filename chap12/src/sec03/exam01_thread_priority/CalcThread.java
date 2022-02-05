package sec03.exam01_thread_priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for (int i =0; i <1000000000; i++) {
			
		}
		System.out.println(getName());
	}
}
