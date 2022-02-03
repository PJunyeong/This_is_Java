package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바와 자바!";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
