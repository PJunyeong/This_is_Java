package sec11.exam01_arrays;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		// ��ü �� �� �ڵ����� ���� (new ������� �ʾƵ� �ȴ�.)
		System.out.println(obj1 == obj2);
		//false
		System.out.println(obj1.equals(obj2));
		//true
		Integer obj3 = 10;
		Integer obj4 = 10;
		// -128~128 ������ ��ü�� '1'���� ���ϵȴ�! 
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
