package sec04.exam02_default_method_use;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	@Override
	public void turnOn() {
		System.out.println("Audio tunred on");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio tunred off");		
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
		System.out.println("Audio volume =" + this.volume);		
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio mute");
		} else {
			System.out.println("Audio unmute");
		}
	}
}
