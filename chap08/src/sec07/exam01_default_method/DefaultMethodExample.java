package sec07.exam01_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		// default 메소드를 통해 보다 편리하게 다른 인터페이스 implements하는 클래스에 적용된다.
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}

}
