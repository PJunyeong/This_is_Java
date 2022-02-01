package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj3);
		System.out.println(obj1.equals(obj3));
		// object equals는 객체 번지로 비교한다
		// equals를 override한 뒤에는 String 문자열만 비교하므로 true return.
	}

}
