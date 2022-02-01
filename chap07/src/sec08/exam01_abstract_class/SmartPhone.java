package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	//추상 클래스 Phone 상속받는 자식 클래스 SmartPhone
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷으로 검색한다.");
	}
}
