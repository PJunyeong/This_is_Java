package sec02.exam01_create_thread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
//		BeepThread thread = new BeepThread();
//		thread.start();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i =0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}			
		};
		thread.start();
		
		
		for (int i = 0; i <5; i++) {
			System.out.println("Beep");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		// beep 스레드와 함께 메인 스레드 실행 (병렬 처리)
	}

}
