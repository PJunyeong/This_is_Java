package chap10.sec02_runtime_exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		// System.out.println(data.toString());
		// NullPointerException occurs!
		// ���� �����̹Ƿ� �����Ϸ��� �״�� �����Ѵ�.
		data = "NullPoinerException_dose not occur!";
		System.out.println(data);
	}

}
