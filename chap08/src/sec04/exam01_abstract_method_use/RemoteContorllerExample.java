package sec04.exam01_abstract_method_use;

public class RemoteContorllerExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
