package sec03.exam02_while;

public class WhileKeyControl {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int keyCode = 0;
		int speed = 0;
		
		while(run) {
		
		if (keyCode != 13 && keyCode != 10) {
			System.out.println("---------------------");
			System.out.println("1. 속도 증가 2. 속도 감소 3. 중지");
			System.out.println("---------------------");
			System.out.println("선택: ");
		}
		// enter는 캐리지 리턴과 \n이므로 13, 10으로 확인
		keyCode = System.in.read();
		
		if (keyCode == 49) {
			speed++;
			System.out.println("현재 속도= " + speed);
		} else if (keyCode == 50) {
			speed--;
			System.out.println("현재 속도= " + speed);
		} else if (keyCode == 51) {
			run = false;
		}
		}
	}

}
