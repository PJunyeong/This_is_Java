package sec05.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		Predicate<String> predicate;
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, null: " + predicate.test(null));
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + predicate.test("Java8"));
		//Collection 요소 중 "특정 문자 동일 체크"를 위해 predicate test를 사용한다.
	
	}

}
