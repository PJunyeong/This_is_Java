package sec04.exam01_overriding;

import java.util.Scanner;

public class ComputerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름 r: ");
		int r = scanner.nextInt();
		
		Calculator calculator = new Calculator();
		System.out.println("원의 넓이: " + calculator.areaCircle(r));
		
		Computer computer = new Computer();
		// computer 객체의 areaCircle은 Calculator의 areaCircle을 override.
		System.out.println("원의 넓이: " + computer.areaCircle(r));
	}

}
