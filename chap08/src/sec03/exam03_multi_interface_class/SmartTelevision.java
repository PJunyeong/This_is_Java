package sec03.exam03_multi_interface_class;

public class SmartTelevision implements RemoteControl, Searchable{
	
	int volume; 
	@Override
	public void turnOn() {
		System.out.println("S-TV turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("S-TV turned off");
	}

	@Override
	public void setVolume(int volume) {
		if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else if (volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}
		this.volume = volume;
		System.out.println("volume= " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println("search: " + url);
	}

}
