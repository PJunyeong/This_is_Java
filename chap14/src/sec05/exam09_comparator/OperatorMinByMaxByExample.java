package sec05.exam09_comparator;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1, f2) ->
		Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("바나나", 6000), new Fruit("딸기", 8000));
		System.out.println(fruit.name + "가 더 가격이 저렴합니다.");
		
		binaryOperator = BinaryOperator.maxBy((f1, f2) ->
		Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("수박", 7000), new Fruit("자두", 15000));
		System.out.println(fruit.name + "가 더 가격이 비쌉니다.");
		
		
	}

}
