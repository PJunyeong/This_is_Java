package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	//�߻� Ŭ���� Phone ��ӹ޴� �ڽ� Ŭ���� SmartPhone
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("���ͳ����� �˻��Ѵ�.");
	}
}
