package sec03.exam01_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<>();
		Product<Car, String> product2 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("SAMSUNG TV");
		
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		product2.setKind(new Car());
		product2.setModel("Tesla");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		// ������ Ÿ�� �Ķ���ʹ�� �����Ӱ� ��Ƽ �Ķ���� ���� ����!
	}

}
