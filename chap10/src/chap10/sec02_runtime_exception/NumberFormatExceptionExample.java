package chap10.sec02_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String str1 = "1000";
		String str2 = "A1000";
		
		int val1 = Integer.parseInt(str1);
		// int val2 = Integer.parseInt(str2);
		// String -> A1000. cannot convert.
	}

}
