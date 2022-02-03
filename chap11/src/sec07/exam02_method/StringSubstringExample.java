package sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "12345678-12345478";
		String firstNum = ssn.substring(0, 8);
		System.out.println(firstNum);
		String secondNum = ssn.substring(9);
		System.out.println(secondNum);
	}

}
