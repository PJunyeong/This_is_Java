package chap10.sec02_runtime_exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		// System.out.println(data.toString());
		// NullPointerException occurs!
		// 실행 예외이므로 컴파일러는 그대로 실행한다.
		data = "NullPoinerException_dose not occur!";
		System.out.println(data);
	}

}
