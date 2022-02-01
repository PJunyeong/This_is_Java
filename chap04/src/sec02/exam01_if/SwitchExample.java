package sec02.exam01_if;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
		}
		// switch case에서 break를 통해 case 충족시 탈출.
	}

}
