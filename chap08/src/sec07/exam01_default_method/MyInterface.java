package sec07.exam01_default_method;

public interface MyInterface {
	public void method1();
	// public void method2();
	// 인터페이스에서 추상 클래스 추가 시 이 인터페이스를 implements하는 다른 클래스 수정 필요
	public default void method2() {
		// default method는 실행 블록 가진다.
		System.out.println("MyInterface- default method2");
	}
}
