package sec03.exam03_toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "������");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		//System.out.println�� �ڵ����� ��ü�� toString�� ȣ���Ѵ�.
	}

}
