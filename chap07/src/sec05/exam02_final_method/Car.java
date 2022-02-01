package sec05.exam02_final_method;

public class Car {
	public int speed;
	
	public void speedUp() {
		this.speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춘다.");
		this.speed = 0;
	}
	// stop() 메소드는 override될 수 없는 final 메소드로 선언되었다.
}
