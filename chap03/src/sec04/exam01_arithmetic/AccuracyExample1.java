package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한 개 - 0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		// 실수 사용
		
		int temp = apple*10 - number;
		double result2 = temp/10.0;
		
		System.out.println(result2);
		// int를 사용해 계산한 뒤 실수로 나누어 계산한다.
		
	}

}
