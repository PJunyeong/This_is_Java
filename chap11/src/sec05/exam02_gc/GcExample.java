package sec05.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		emp = new Employee(1);
		emp = null;
		// 메모리 주소 잃어버린다.
		emp = new Employee(2);
		emp = new Employee(3);
		System.out.print("emp ->: ");
		System.out.println(emp.eno);
		System.gc();
		//gc 메소드 호출 시 gc에게 빨리 실행된다.
	}

}
