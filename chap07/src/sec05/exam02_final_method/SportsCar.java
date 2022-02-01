package sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		this.speed += 10;
	}
	
	// stop() 메소드는 final로 선언되었기 때문에 override할 수 없다.
}
