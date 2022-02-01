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
		// 같으므로 0 리턴
		int result2 = Objects.compare(s2, s3, new StudentComparator());
		System.out.println(result2);
		// Object가 가지고 있는 compare 메소드 
		
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
		//Comparator을 import해야 한다.
		//Comparator이라는 인터페이스를 implements하는 이 클래스.
		
	}
}
