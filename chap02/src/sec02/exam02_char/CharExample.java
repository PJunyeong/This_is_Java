package sec02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		// 유니코드 65를 char로 출력시 'A'.
		
		char c3 = '\u0041';
		System.out.println(c3);
		
		char c4 = '가';
		System.out.println(c4);
		char c5 = 44032;
		char c6 = '\uAC00';
		System.out.println(c4);
		System.out.println(c5);
		int uniCode1 = c1;
		System.out.println(uniCode1);
		// char 타입의 문자가 어떤 정수값인지 알기 위해 int로 캐스팅한다.

	}

}
