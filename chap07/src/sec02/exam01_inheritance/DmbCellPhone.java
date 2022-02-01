package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		// model, color�� CellPhone �θ� Ŭ�������� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä�� " + this.channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + this.channel + "������ ����� �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ������ ����ϴ�.");
	}

}
