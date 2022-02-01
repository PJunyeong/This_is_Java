package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("박준영");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		// 추상 클래스를 사용해 실체 클래스를 생성 (상속 사용)
	}
}
