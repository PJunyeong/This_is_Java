package sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		IntPredicate predicateA = a -> a%2 == 0;
		IntPredicate predicateB = a -> a%3 ==0;
		IntPredicate predicateAB;
		
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		// && �����Ѵ�
		result = predicateAB.test(9);
		System.out.println("9 -> 2 and 3 ���?: " + result);
		
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9 -> 2 or 3 ���?: " + result);
		
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9 -> 2�� ��� X?: " + result);	
	}

}
