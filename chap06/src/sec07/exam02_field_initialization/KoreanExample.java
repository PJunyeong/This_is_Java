package sec07.exam02_field_initialization;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박준영", "980202");
		Korean k2 = new Korean("박준영", "980203");
		System.out.println("k1's name: " + k1.name);
		System.out.println("k1's ssn: " + k1.ssn);
		System.out.println("k2's name: " + k2.name);
		System.out.println("k2's ssn: " + k2.ssn);
		// 생성자를 호출하면서 필드에 초기값을 파라미터로 준다.
		// 서로 다른 new 객체로 인스턴스화하였으므로 객체 주소 다르다.
		System.out.println("k1 == k2?: " + (k1 == k2));
		
	}

}
