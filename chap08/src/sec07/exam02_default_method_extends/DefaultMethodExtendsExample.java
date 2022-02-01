package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ci1 - method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci1 - method3()");				
			}
			
		};
		
		ci1.method1();
		ci1.method2();
		//ParentInterface의 default method를 그대로 사용한다.
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ci2 - method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci2 - method3()");				
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		//ChildInterface2에서 override한 메소드가 선언된다.
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ci3 - method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci3 - method3()");				
			}

			@Override
			public void method2() {
				System.out.println("ci3 - method2()");
			}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		// method2는 실행 시 추상 메소드로 override.
		
		
	}

}
