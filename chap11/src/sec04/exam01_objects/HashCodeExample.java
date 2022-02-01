package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(123, "A");
		Student s2 = new Student(123, "A");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		//hashCode는 여기서 override된 메소드.
		
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
			//sno, name 두 객체를 통해 하나의 hash 코드를 반환한다.
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
