package verify.Exercise18;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService singleton1 = ShopService.getInstance();
		ShopService singleton2 = ShopService.getInstance();
		// singleton이므로 new로 생성할 수 없고 클래스 내 메소드가 제공하는 객체만 리턴받아 사용한다.
		System.out.println(singleton1 == singleton2);
	}

}
