package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 87;
		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		
		int score2 = 90;
		
		if (score2 >= 90) {
			System.out.println("score >= 90");
			System.out.println("grade: A");
		} else if (score2 >= 80) {
			System.out.println("score >= 80");
			System.out.println("grade: B");
		} else if (score2 >= 70) {
			System.out.println("score >= 70");
			System.out.println("grade: C");
		}
		
		int num = (int) (Math.random()*6) + 1;
		// 0 <= Math.random() < 1. 
		// 0 <= Math.random() * 6 < 6.
		// 1 <= Math.random() * 6 + 1 < 7. -> 1~6		
		
		if (num==1) {
			System.out.println("1��");
		} else if (num==2) {
			System.out.println("2��");	
		} else if (num==3) {
			System.out.println("3��");	
		} else if (num==4) {
			System.out.println("4��");	
		} else if (num==5) {
			System.out.println("5��");	
		} else {
			System.out.println("6��");	
		}
	}

}
