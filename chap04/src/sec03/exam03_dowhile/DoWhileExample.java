package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽��� �Է�");
		System.out.println("���α׷� ����: q �Է�");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println("\n���α׷� ����");
	}
	
		// nextLine�� ���� '�� ��'�� �Է��Ѵ�. nextLines�� '���� ��'.
}
