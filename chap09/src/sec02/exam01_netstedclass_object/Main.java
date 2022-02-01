package sec02.exam01_netstedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		//A.B b = new A.B();
		A.B b = a.new B();
		//B는 A내에 호출된 인스턴스 클래스이므로 
		b.method1();
		
		A.C c = new A.C();
		// 클래스 C는 정적 클래스이므로 밖에서 바로 선언 가능.
		c.field1 = 3;
		c.method1();
		c.method2();
		A.C.method2();
		// static이므로 객체 없이 곧바로 선언 가능.
		
		a.method();
		// D 객체 직접 접근 X, 클래스 A 객체 a를 통해 간접적으로 사용
	}
	

}
