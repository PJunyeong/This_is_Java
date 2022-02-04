package sec02.exam01_create_thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		// Ŭ������ �ֱ� (1)
		
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
		
		// �͸� ���� ��ü�� �ֱ� (2)
		
		Thread thread = new Thread( ()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i =0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(Exception e) {}
		}});
		// ���ٽ��� �ڵ����� run �޼ҵ� �������̵����ش�. (3)
		for (int i = 0; i <5; i++) {
			System.out.println("Beep");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		// beep ������� �Բ� ���� ������ ���� (���� ó��)
	}

}
