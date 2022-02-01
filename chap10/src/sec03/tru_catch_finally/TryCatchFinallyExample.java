package sec03.tru_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("Class is here");
		} catch(ClassNotFoundException e) {
			System.out.println("Class is not here");
		} finally {
			//finally는 예외 발생 여부에 관계없이 실행한다.
			System.out.println("Program exits");
		}
		
		//ClassnotException -> 예외 처리 필요
	}

}
