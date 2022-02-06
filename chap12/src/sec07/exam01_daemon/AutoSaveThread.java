package sec07.exam01_daemon;

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
