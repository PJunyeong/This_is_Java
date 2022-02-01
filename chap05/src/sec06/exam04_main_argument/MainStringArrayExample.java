package sec06.exam04_main_argument;

public class MainStringArrayExample {
	public static void main(String[] args) {
		System.out.println("배열의 길이: " + args.length);
		// main 메소드 실행 시 넘겨주는 argument의 길이를 출력한다.
		
		if (args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java sec06.exam04_main_argument.MainStringArrayExample num1 num2");
			System.exit(0);
			// JVM을 종료하는 커맨드
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		//문자열을 정수로 변환하는 parseInte 명령어. 
		//문자열이 digit이 아니면 NumberFormatException이 발생한다.
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
