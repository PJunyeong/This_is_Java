package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1=  Util.<Integer>boxing(100);
		// <>�� ���� Ÿ�� �Ķ���͸� ���ȭ�Ͽ��� �� ������ ��������.
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("���ؿ�");
		// <>�� ��Ȯ�� Ÿ�� �Ķ���Ͱ� ��õ��� ���� ��� �����Ϸ��� �ڵ� ����.
		String strValue = box2.get();
		System.out.println(strValue);
	
	}	

}
