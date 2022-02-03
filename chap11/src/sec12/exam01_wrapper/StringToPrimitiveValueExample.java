package sec12.exam01_wrapper;

import java.util.Scanner;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter int: ");
		String str1 = scanner.nextLine();
		int value1 = Integer.parseInt(str1);
		System.out.println(value1);
		
		System.out.print("Enter double: ");
		String str2 = scanner.nextLine();
		double value2 = Double.parseDouble(str2);
		System.out.println(value2);
		
		System.out.print("Enter int: ");
		String str3 = scanner.nextLine();
		boolean value3 = Boolean.parseBoolean(str3);
		System.out.println(value3);
	}

}
