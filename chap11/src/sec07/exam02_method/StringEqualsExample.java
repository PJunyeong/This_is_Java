package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("박준영");
		String strVar2 = "박준영";
		String strVar3 = "박준영";
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar2.equals(strVar3));
	}

}
