package sec04.exam02_default_method_use;

public class RemoteContorllerExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		//Television 클래스에 setMute가 선언되어 있지 않아도 default 메소드이므로 사용할 수 있다.
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		// Audio 클래스에서 default 메소드 Override한 메소드를 호출한다.
		// Television, Audio 등 인터페이스 implement한 클래스 모두 default 메소드를 쓸 수 있다.
	
		
	}

}
