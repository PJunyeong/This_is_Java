package verify.Exercise18;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService singleton1 = ShopService.getInstance();
		ShopService singleton2 = ShopService.getInstance();
		// singleton�̹Ƿ� new�� ������ �� ���� Ŭ���� �� �޼ҵ尡 �����ϴ� ��ü�� ���Ϲ޾� ����Ѵ�.
		System.out.println(singleton1 == singleton2);
	}

}
