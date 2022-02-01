package sec07.exam03_constructor_overloading;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
	}
	//�ٸ� �����ڰ� ����Ǹ� �⺻ �����ڴ� ������� �����Ƿ� ��������� ������ �ʿ䰡 �ִ�.
	Car(String model){
		// this.model = model;
		this(model, null, 0);
	}
	Car(String model, String color){
		// this.model = model;
		// this.color = color;
		this(model, color, 0);
	}
	// �ߺ� �ڵ带 ���̱� ���� ������ '�� �� �ڵ�'���� this() ȣ���ؼ� ����� �Ķ���͸� �����ϰ� �������� �⺻������.
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// �Ķ���� ���� ����, Ÿ��, ������ ���� ���� �ٸ� �����ڸ� ������ �� �ִ�.
}
