package sec04.exam01_overriding;

public class Computer extends Calculator {
	@Override
	// override�� ���� �θ� ��ü�� '�ٸ�' ������ ������ �´��� Ȯ���Ѵ�.
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle ����");
		return Math.PI * r * r;
	}
}
