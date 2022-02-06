package sec08.exam01_thread_group;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("saved");
	}
	
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			break;
		}
		save();
		}
		}
		
}
