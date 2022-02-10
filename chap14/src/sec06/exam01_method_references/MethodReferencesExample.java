package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("���ٽ�: "+ operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("�޼ҵ� ȣ��: " + operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("���ٽ�: " + operator.applyAsInt(5,1));
		
		operator = obj :: instanceMethod;
		System.out.println("�޼ҵ� ȣ��: " + operator.applyAsInt(7, 8));
	}

}
