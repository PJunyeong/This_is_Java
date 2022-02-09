package sec06.exam01_generic_wildcard;

public class Course<T> {
	//Course 수강 가능한 대상을 T라고 한다.
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
		// T가 미정인 상태에서 T 배열을 못 만들기 때문에 Object를 먼저 만들고 캐스팅한다.
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
				// 가장 처음 만나는 빈 자리에 add한다.
				students[i] = t;
				System.out.println("add done");
				break;
			}
		}
	}
	
}
