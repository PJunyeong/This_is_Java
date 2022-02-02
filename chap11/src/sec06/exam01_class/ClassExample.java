package sec06.exam01_class;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		// sec06.exam01_class.Car
		System.out.println(clazz1.getPackageName());
		// sec06.exam01_class
		System.out.println(clazz1.getSimpleName());
		// Car
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getPackageName());
			System.out.println(clazz2.getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
