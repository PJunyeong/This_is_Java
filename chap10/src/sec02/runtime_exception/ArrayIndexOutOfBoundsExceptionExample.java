package sec02.runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		if (args.length == 2) {
		String str1 = args[0];
		String str2 = args[1];
		System.out.println("args[0]: " + str1);
		System.out.println("args[1]: " + str2);
		} else {
			System.out.println("java ArrayIndexOutOfBoundsException");
			System.out.println("RUN CONFIGURE!");
		}
		// Run Configuration -> Argument에 데이터 두 개
	}

}
