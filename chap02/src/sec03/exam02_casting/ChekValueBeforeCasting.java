package sec03.exam02_casting;

public class ChekValueBeforeCasting {

	public static void main(String[] args) {
		int i = 125;
		//byte b = i;
		// 4����Ʈ�� 1����Ʈ�� �� �� ����.

		//byte b = (byte) i;
		// 128�� ����Ʈ ������ �ʰ��ϹǷ� ���� �Ұ���
		//System.out.println(b);
		
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�����ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}

}
