package sec05.exam09_comparator;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1, f2) ->
		Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("�ٳ���", 6000), new Fruit("����", 8000));
		System.out.println(fruit.name + "�� �� ������ �����մϴ�.");
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) ->
		Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 7000), new Fruit("�ڵ�", 15000));
		System.out.println(fruit.name + "�� �� ������ ��Դϴ�.");
		
		
	}

}
