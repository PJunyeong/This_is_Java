package sec05.exam07_andthen_compose;
import java.util.function.Function;
public class FunctionAndThenComposerExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		// A, B 연결 -> AB 얻어내자
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		functionAB = functionA.andThen(functionB);
		
		String city = functionAB.apply(new Member("홍길동", "hong", 
				new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", 
				new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		// andthen과 compose가 적용되는 AB A->B / B->A 순서대로 된다
				
	}

}
