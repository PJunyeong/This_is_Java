package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		// Member 객체를 리턴한다. 매개변수 String를 파라미터로 가지는 생성자 new가 호출된다.
		Member member1 = function1.apply("angel");
		//Member(String id) 실행
		BiFunction<String, String, Member> function2 = Member :: new;
		// Member 객체를 리턴할 때, 파라미터 String String인 생성자 호출된다.
		Member member2 = function2.apply("이름", "angel");
		// Member(String name, String id) 실행
	}

}
