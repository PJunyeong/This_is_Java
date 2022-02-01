package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지 입력");
		System.out.println("프로그램 종료: q 입력");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println("\n프로그램 종료");
	}
	
		// nextLine을 통해 '한 줄'을 입력한다. nextLines는 '여러 줄'.
}
