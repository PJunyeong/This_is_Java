package sec03.exam03_multi_interface_class;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		Searchable searchable = new SmartTelevision();
		searchable.search("some url");
	}

}
