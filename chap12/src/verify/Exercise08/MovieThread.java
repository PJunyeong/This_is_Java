package verify.Exercise08;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("������ ���");
			
			if (Thread.interrupted()) {
				break;
			}
		}
	}
}
