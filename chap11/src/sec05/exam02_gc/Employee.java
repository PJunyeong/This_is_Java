package sec05.exam02_gc;

public class Employee {
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + this.eno + ") created");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + this.eno + ") removed");
	}
	
}
