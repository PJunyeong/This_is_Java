package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		// model, color은 CellPhone 부모 클래스에서 상속받은 필드
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 " + this.channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + this.channel + "번으로 방송을 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 멈춥니다.");
	}

}
