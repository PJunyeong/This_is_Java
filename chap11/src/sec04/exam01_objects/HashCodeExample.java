package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(123, "A");
		Student s2 = new Student(123, "A");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		//hashCode�� ���⼭ override�� �޼ҵ�.
		
	}
	static  class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
			//sno, name �� ��ü�� ���� �ϳ��� hash �ڵ带 ��ȯ�Ѵ�.
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student s = (Student) obj;
				if (s.sno == this.sno) {
					if (s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
