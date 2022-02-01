package sec03.exam02_unknown_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
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
		};
		// 익명 구현 객체 내부에서 '추가적으로' 사용한 메소드는 외부에서 사용 불가능
		// 즉 추상 메소드를 override한 메소드만 사용할 수 있다. 
		// bin 파일에 class_name + $ + number.class 형성된다.
		rc.setVolume(10);
	}

}
