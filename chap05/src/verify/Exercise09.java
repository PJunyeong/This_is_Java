package verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 학생 수 2. 점수 3. 점수표 4. 분석 5. 종료");
			System.out.println("------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생 수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				System.out.println("점수 입력 완료");
				break;
			case 3:
				int i = 0;
				for (int score: scores) {
					System.out.println("scores[" + i + "]=" + score);
					i += 1;
				}
				System.out.println("점수 출력 완료");
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int score: scores) {
					max = (max < score ? score:max);
					sum += score;
				}
				avg = (double) sum/studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력");
			}
		}
	}

}
