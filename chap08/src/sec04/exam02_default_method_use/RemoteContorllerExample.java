package sec04.exam02_default_method_use;

public class RemoteContorllerExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		//Television Ŭ������ setMute�� ����Ǿ� ���� �ʾƵ� default �޼ҵ��̹Ƿ� ����� �� �ִ�.
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		// Audio Ŭ�������� default �޼ҵ� Override�� �޼ҵ带 ȣ���Ѵ�.
		// Television, Audio �� �������̽� implement�� Ŭ���� ��� default �޼ҵ带 �� �� �ִ�.
	
		
	}

}
