package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		for (int i=0; i <10; i++) {
			int num = (int) (Math.random()*45) + 1;
			System.out.println(num);
		}
		// �������� ���� ���� �����ϴ� ���. Math.random()�� 0.0 �̻� 1.0 �̸� ���� ��ȯ�ϱ� ������ int�� ĳ���� ���� ���� ���� ���� ���Ѵ�!
		
	}

}
