package sec08.exam01_abstract_class;

public abstract class Phone {
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
}
