package sec06.exam01_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A {
	public D() {
		this.field = "D에서 생성";
		this.method();
		// 다른 패키지일지라도 A를 상속받았으므로 protected 생성자, 필드, 메소드 사용할 수 있다.
	}

}
