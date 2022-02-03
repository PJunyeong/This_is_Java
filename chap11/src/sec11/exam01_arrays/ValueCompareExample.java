package sec11.exam01_arrays;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		// 개체 두 개 자동으로 생성 (new 사용하지 않아도 된다.)
		System.out.println(obj1 == obj2);
		//false
		System.out.println(obj1.equals(obj2));
		//true
		Integer obj3 = 10;
		Integer obj4 = 10;
		// -128~128 범위의 객체는 '1'개만 리턴된다! 
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
