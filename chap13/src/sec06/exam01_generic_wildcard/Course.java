package sec06.exam01_generic_wildcard;

public class Course<T> {
	//Course ���� ������ ����� T��� �Ѵ�.
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
		// T�� ������ ���¿��� T �迭�� �� ����� ������ Object�� ���� ����� ĳ�����Ѵ�.
	}
	public String getName() {
		return this.name;
	}
	public T[] getStudents() {
		return this.students;
	}
	public void add(T t) {
		for (int i =0; i <students.length; i++) {
			if (students[i] == null) {
				// ���� ó�� ������ �� �ڸ��� add�Ѵ�.
				students[i] = t;
				System.out.println("add done");
				break;
			}
		}
	}
	
}
