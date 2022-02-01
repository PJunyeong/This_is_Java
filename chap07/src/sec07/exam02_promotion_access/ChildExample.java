package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// override된 method2()가 호출된다.
		// parent.method3();
		// parent 타입이므로 child에만 있는 method3은 사용할 수 없다.
	}

}
