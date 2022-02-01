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
		// �͸� ���� ��ü ���ο��� '�߰�������' ����� �޼ҵ�� �ܺο��� ��� �Ұ���
		// �� �߻� �޼ҵ带 override�� �޼ҵ常 ����� �� �ִ�. 
		// bin ���Ͽ� class_name + $ + number.class �����ȴ�.
		rc.setVolume(10);
	}

}
