package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int num1 = 1000;
		int num2 = 2000;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("plus: " + myCalc.plus(num1, num2));
		System.out.println("minus: " + myCalc.minus(num1, num2));
		System.out.println("multiply: " + myCalc.multiply(num1, num2));
		System.out.println("divide: " + myCalc.divide(num1, num2));
		myCalc.powerOff();
	}

}
