package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		currentBalance += val;
		System.out.println(currentBalance);
		// NaN은 산술 연산이 가능하므로 데이터를 검사할 필요가 있다.
		
		
	}

}
