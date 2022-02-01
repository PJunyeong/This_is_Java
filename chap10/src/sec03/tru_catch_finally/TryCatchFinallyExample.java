package sec03.tru_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("Class is here");
		} catch(ClassNotFoundException e) {
			System.out.println("Class is not here");
		} finally {
			//finally�� ���� �߻� ���ο� ������� �����Ѵ�.
			System.out.println("Program exits");
		}
		
		//ClassnotException -> ���� ó�� �ʿ�
	}

}
