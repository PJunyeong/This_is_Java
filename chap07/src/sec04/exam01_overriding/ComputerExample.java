package sec04.exam01_overriding;

import java.util.Scanner;

public class ComputerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ r: ");
		int r = scanner.nextInt();
		
		Calculator calculator = new Calculator();
		System.out.println("���� ����: " + calculator.areaCircle(r));
		
		Computer computer = new Computer();
		// computer ��ü�� areaCircle�� Calculator�� areaCircle�� override.
		System.out.println("���� ����: " + computer.areaCircle(r));
	}

}
