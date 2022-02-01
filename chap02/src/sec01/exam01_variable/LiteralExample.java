package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		int var1 = 10;
		// var1에 10진수 10을 저장한다.
		System.out.println(var1);
		
		int var2 = 010;
		// var2에 8진수 10을 저장한다.
		System.out.println(var2);
		
		int var3 = 0x10;
		// var3에 16진수 10을 저장한다.
		System.out.println(var3);
		
		double var4 = 0.25;
		// var4에 0.25 저장
		System.out.println(var4);
		
		double var5 = 2E5;
		//지수와 가수 2 * 10^5
		System.out.println(var5);
		
		char var6 = 'A';
		// 유니코드로 문자를 사용한다. 
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println('\t' + "들여쓰기");
		System.out.println("대한" + '\n' + "민국");
		System.out.println("This" + '\'' + "s Java");
		System.out.println("이것은 " + '\"' + "중요" + '\"' + "합니다");
		System.out.println("가격은" + '\\' + "100만원입니다");
		
		char var8 = '\u0041';
		// 유니코드로 16진수 수를 입력한다.
		// 64 + 1 = 65
		
		System.out.println("대한" + "민국");
		System.out.println("Java" + 8);
		
		String var9 = "Java";
		boolean var10 = true;
		// 참 거짓 불리언 값을 var10에 저장한다.
		System.out.println(var10);
		
		
		
		
	}
}
