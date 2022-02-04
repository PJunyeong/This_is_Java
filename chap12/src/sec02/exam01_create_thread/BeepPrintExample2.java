package sec02.exam01_create_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		// 클래스로 넣기 (1)
		
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i =0; i<5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch(Exception e) {}
//				}
//			}
//			
//		});
//		thread.start();
		
		// 익명 구현 개체로 넣기 (2)
		
		Thread thread = new Thread( ()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i =0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(Exception e) {}
		}});
		// 람다식이 자동으로 run 메소드 오버라이딩해준다. (3)
		for (int i = 0; i <5; i++) {
			System.out.println("Beep");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		// beep 스레드와 함께 메인 스레드 실행 (병렬 처리)
	}

}
