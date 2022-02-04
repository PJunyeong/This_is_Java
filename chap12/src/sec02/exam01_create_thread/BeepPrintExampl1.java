package sec02.exam01_create_thread;

import java.awt.Toolkit;
public class BeepPrintExampl1 {

	public static void main(String[] args) {
		// 메인 스레드에서만 두 가지 작업을 실행한다.
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		
		for (int i =0; i <5;i++) {
			System.out.println("Beep");
		} try {Thread.sleep(500);
		} catch(Exception e) {}
	}

}
