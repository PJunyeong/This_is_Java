package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; 산술 연산의 기본은 int이므로 강제 캐스팅이 필요하다.
		int result = c2 + 1;
		System.out.println(result);
		
		char c3 = (char) (c2 + 1);
		// 강제 캐스팅을 통해 int를 char로 변환한다.
		System.out.println(c3);
	}

}
