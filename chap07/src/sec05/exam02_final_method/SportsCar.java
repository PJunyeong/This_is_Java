package sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		this.speed += 10;
	}
	
	// stop() �޼ҵ�� final�� ����Ǿ��� ������ override�� �� ����.
}
