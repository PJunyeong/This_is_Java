package sec12.exam01_wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		int val4 = obj4.intValue();
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}

}
