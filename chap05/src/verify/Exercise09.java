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
			System.out.println("1. �л� �� 2. ���� 3. ����ǥ 4. �м� 5. ����");
			System.out.println("------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("�л� ��>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				System.out.println("���� �Է� �Ϸ�");
				break;
			case 3:
				int i = 0;
				for (int score: scores) {
					System.out.println("scores[" + i + "]=" + score);
					i += 1;
				}
				System.out.println("���� ��� �Ϸ�");
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
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
				break;
			case 5:
				run = false;
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("�ٽ� �Է�");
			}
		}
	}

}
