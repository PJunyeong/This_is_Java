package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("���ؿ�");
		String strVar2 = "���ؿ�";
		String strVar3 = "���ؿ�";
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar2.equals(strVar3));
	}

}
