package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	//sound를 필수로 상속받아야 한다.
}
