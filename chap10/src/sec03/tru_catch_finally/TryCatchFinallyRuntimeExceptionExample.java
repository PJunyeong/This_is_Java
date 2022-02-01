package sec03.tru_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
		data1 = args[0];
		data2 = args[1];
		System.out.println(data1 + data2);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("check your args");
		}
		//args 여부에 따라 ArrayIndexOutOfBoundsException이 일어난다.
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);	
			int result = value1 + value2;
			System.out.println(result);
			} catch(NumberFormatException e) {
				System.out.println("convert your string into integer");
			} finally {
				System.out.println("Program exits");
			}
		
		//NumberFormatException이 String 내 digit 존재 여부에 따라 일어난다.ㅈ
		
		
	}

}
