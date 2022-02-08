package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("박준영");
		String str = (String) box.get();
		// 최상위 타입 Object를 String으로 강제 캐스팅해야 한다
		// -> 불필요한 리소스 변환 때문에 속도 저하!
		System.out.println("box.get(): " + str);
		box.set(new Apple());
		// Object는 그 어떤 객체라도 받을 수 있다. String, class 등 모두 대입 가능!
		// 다양한 객체 저장은 장점이지만 타입 변환으로 인한 오버헤드가 크다.
		Apple apple = (Apple) box.get();
		
		
	}

}
