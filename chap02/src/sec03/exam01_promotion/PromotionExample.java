package sec03.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		 byte byteValue = 10;
		 int intValue = byteValue;
		 // �ڵ� ĳ����
		 System.out.println(intValue);
		 
		 char charValue = '��';
		 intValue = charValue;
		 // �ڵ� ĳ����
		 System.out.println(intValue);
		 
		 intValue = 500;
		 long longValue = intValue;
		 // �ڵ� ĳ����
		 System.out.println(longValue);
		 
		 intValue = 200;
		 double doubleValue = intValue;
		 // �ڵ� ĳ����
		 System.out.println(doubleValue);
		 
		 longValue = 10000000000L;
		 float floatValue = longValue;
		 // long Ÿ�Ե� float Ÿ�Կ� ���Ѵ�. ����Ʈ ũ�Ⱑ �ٸ����� �Ǽ� ���� ������ �� ũ��.
		 System.out.println(floatValue);
	}

}
