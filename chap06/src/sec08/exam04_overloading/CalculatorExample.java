package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		// 파라미터를 int로 줘도 메소드 내부에서 double로 자동 캐스팅.
		System.out.println(result1);
		System.out.println(result2);
	
	}

}
