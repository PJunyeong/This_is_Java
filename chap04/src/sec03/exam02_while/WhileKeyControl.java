package sec03.exam02_while;

public class WhileKeyControl {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int keyCode = 0;
		int speed = 0;
		
		while(run) {
		
		if (keyCode != 13 && keyCode != 10) {
			System.out.println("---------------------");
			System.out.println("1. �ӵ� ���� 2. �ӵ� ���� 3. ����");
			System.out.println("---------------------");
			System.out.println("����: ");
		}
		// enter�� ĳ���� ���ϰ� \n�̹Ƿ� 13, 10���� Ȯ��
		keyCode = System.in.read();
		
		if (keyCode == 49) {
			speed++;
			System.out.println("���� �ӵ�= " + speed);
		} else if (keyCode == 50) {
			speed--;
			System.out.println("���� �ӵ�= " + speed);
		} else if (keyCode == 51) {
			run = false;
		}
		}
	}

}
