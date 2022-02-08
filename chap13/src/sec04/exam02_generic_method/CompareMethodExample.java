package sec04.exam02_generic_method;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		Pair<Integer, String> p3 = new Pair<>(3, "banana");
		Pair<String, String> p4 = new Pair<>("4", "banana");
		
		boolean p1_p2 = Util.<Integer, String> compare(p1, p2);
		System.out.println("p1 == p2?: " + p1_p2);
		boolean p1_p3 = Util.compare(p1, p3);
		System.out.println("p1 == p3?: " + p1_p3);
//		boolean p3_p4 = Util.compare(p3, p4);
//		System.out.println("p3 == p4?: " + p3_p4);
//		Util에서 넘어가는 제네릭 파라미터는 p3, p4가 모두 '같은 종류'여야 메소드 파라미터로 넘어갈 수 있다.
		
	}

}
