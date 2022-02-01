package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 87;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
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
			System.out.println("1번");
		} else if (num==2) {
			System.out.println("2번");	
		} else if (num==3) {
			System.out.println("3번");	
		} else if (num==4) {
			System.out.println("4번");	
		} else if (num==5) {
			System.out.println("5번");	
		} else {
			System.out.println("6번");	
		}
	}

}
