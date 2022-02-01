package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {
			System.out.println("NaN 입력으로 인해 처리 불가능");
			val = 0.0;
		}
		
		currentBalance += val;
		
		System.out.println(currentBalance);
	}

}
