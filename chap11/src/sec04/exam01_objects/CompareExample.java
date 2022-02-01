package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result1 = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result1);
		// �����Ƿ� 0 ����
		int result2 = Objects.compare(s2, s3, new StudentComparator());
		System.out.println(result2);
		// Object�� ������ �ִ� compare �޼ҵ� 
		
	}
	static class Student{
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return Integer.compare(s1.sno, s2.sno);
		}
		//Comparator�� import�ؾ� �Ѵ�.
		//Comparator�̶�� �������̽��� implements�ϴ� �� Ŭ����.
		
	}
}
