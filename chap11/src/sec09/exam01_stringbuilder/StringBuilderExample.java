package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// String + 사용시 String 객체가 계속 생성되므로 성능 향상에 도움
		sb.append("Java ");
		sb.append("Programming");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '8');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println(length);
		
		String result = sb.toString();
		System.out.println(result);
	}

}
