package sec03.exam03_toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("애플", "아이폰");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		//System.out.println은 자동으로 객체의 toString을 호출한다.
	}

}
