package sec04.exam01_class;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		// new -> ��ü ���� Student -> ������ () -> �Ķ���� �Ѱ��ش�
		// Student Ŭ���� s1�� new�� ������ ��ü �ּҸ� �����Ѵ�.
		
		Student s2 = new Student();
		System.out.println("s1 == s2 ?: " + (s1 == s2));
		// s1�� s2�� ���� �ٸ� ��ü�� �����Ѵ�. ���� �ּҰ� �ٸ���.
		
	}

}
