package sec04.exam02_super;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == NORMAL) {
			super.fly();
		} else if (flyMode == SUPERSONIC){
			System.out.println("초음속 비행합니다.");
		} else {
			System.out.println("잘못된 비행 모드입니다.");
		}
	}

}
