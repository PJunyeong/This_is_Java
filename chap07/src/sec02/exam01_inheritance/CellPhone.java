package sec02.exam01_inheritance;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String msg) {System.out.println("�ڽ�: " + msg);}
	void receiveVoice(String msg) {System.out.println("���: " + msg);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}
