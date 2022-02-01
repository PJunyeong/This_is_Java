package sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed <= 0) {
			speed = 0;
			setStop(false);
		} else {setStop(true);}
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	// 이클립스는 Source/Generate getter and setter를 통해 특정 변수에 대한 getter/setter를 자동으로 설정할 수 있다.
//	public int getSpeed() {
//		return this.speed;
//	}
//	
//	public boolean isStop() {
//		return this.stop;
//	}
//	
//	public void setSpeed(int speed) {
//		if (speed < 0) {
//			this.speed = 0;
//		} else {
//			this.speed = speed;
//		}
//	}
//	
//	public void setStop(boolean stop) {
//		this.stop = stop;
//		this.speed = 0;
//	}
}
