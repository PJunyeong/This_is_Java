package sec07.exam02_field_initialization;

public class Korean {
	String nation = "���ѹα�";
	// �ʱⰪ
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// �Ķ���Ϳ� �ʵ���� �����ϱ� ���� this.�ʵ�� ȣ���� �������� ��� ���.
	}
	// ������ �̸��� Ŭ���� �̸��� ����. �����ڿ��� name, ssn �ʵ带 �ʱ�ȭ�Ѵ�. 

}
