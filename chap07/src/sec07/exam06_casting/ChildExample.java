package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "parent1";
		parent.method1();
		parent.method2();
		// parent.field2
		// parent.method3() 
		// parent는 Parent 타입이므로 자식 Child에만 있는 요소 X
		
		Child child = (Child) parent;
		child.field2 = "child1";
		child.method3();
		// 강제 타입 캐스팅으로 필드 및 메소드 사용 가능.
	}

}
