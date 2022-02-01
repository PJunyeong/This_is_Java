package sec03.exam03_localclass_access;

public class Outter {
	// ~Java 7
	public void method1(final int arg) {
		int localVariable = 1;
		class Inner{
			void method() {
				// int arg = 10;
				// int localVariable = 1;
				// final을 통해 컴파일러가 메소드 내부에 선언해준다.
				int result = arg + localVariable;
			}
		}
	}
	
	// Java 8~
	
	public void method2(int arg) {
		int localVariable = 1;
		// final 특성을 갖는 변수. Java 8 이상.
		class Inner{
			void method() {
				// final로 붙이지 않으면 필드로 복사된다.
				// int arg = 10;
				// int localVariable = 1;
				// final을 통해 컴파일러가 메소드 내부에 선언해준다.
				int result = arg + localVariable;
			}
		}
	}
}
