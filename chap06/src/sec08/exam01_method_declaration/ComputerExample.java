package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values;
		values = new int[] {1, 2, 3, 4, 5, 6};
		int sum1 = myCom.sum1(values);
		System.out.println(sum1);
		
		int sum2 = myCom.sum1(new int[]{1, 2, 3, 4, 5, 6});
		System.out.println(sum2);
		
		int sum3 = myCom.sum2(values);
		System.out.println(sum3);
		
		int sum4 = myCom.sum2(1, 2, 3, 4, 5, 6);
		System.out.println(sum4);
	}

}
