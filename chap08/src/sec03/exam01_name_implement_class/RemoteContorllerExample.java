package sec03.exam01_name_implement_class;

public class RemoteContorllerExample {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Television();
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(false);
		rc1.turnOff();
		RemoteControl rc2;
		rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(10);
		rc2.turnOff();
	}

}
