package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٿ� �ڹ�!";
		String newStr = oldStr.replace("�ڹ�", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
