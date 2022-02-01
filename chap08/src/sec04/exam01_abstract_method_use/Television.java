package sec04.exam01_abstract_method_use;

public class Television implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Television tunred on");
	}

	@Override
	public void turnOff() {
		System.out.println("Television tunred off");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Television volume =" + this.volume);		
	}
	// 추상 메소드를 정의해야 한다.

}
