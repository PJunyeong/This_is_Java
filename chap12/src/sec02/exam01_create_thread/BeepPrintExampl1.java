package sec02.exam01_create_thread;

import java.awt.Toolkit;
public class BeepPrintExampl1 {

	public static void main(String[] args) {
		// ���� �����忡���� �� ���� �۾��� �����Ѵ�.
		
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
