package sec05.exam02_final_method;

public class Car {
	public int speed;
	
	public void speedUp() {
		this.speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� �����.");
		this.speed = 0;
	}
	// stop() �޼ҵ�� override�� �� ���� final �޼ҵ�� ����Ǿ���.
}
