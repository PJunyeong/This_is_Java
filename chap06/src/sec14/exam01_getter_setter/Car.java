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
	// ��Ŭ������ Source/Generate getter and setter�� ���� Ư�� ������ ���� getter/setter�� �ڵ����� ������ �� �ִ�.
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
