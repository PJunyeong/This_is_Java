package sec07.exam07_instanceof;

public class InstanceOfExample {
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("method1 성공");
		} else {
			System.out.println("method1 실패");
		}
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		Parent parentB = new Parent();
		method1(parentB);
		// Parent 객체는 Parent의 Child의 instance가 아니므로 실패한다.
		// 즉 강제 타입 캐스팅이 실패한다.
	}

}
