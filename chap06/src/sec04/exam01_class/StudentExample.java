package sec04.exam01_class;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		// new -> 객체 생성 Student -> 생성자 () -> 파라미터 넘겨준다
		// Student 클래스 s1이 new가 생성한 객체 주소를 저장한다.
		
		Student s2 = new Student();
		System.out.println("s1 == s2 ?: " + (s1 == s2));
		// s1과 s2는 서로 다른 객체를 참조한다. 따라서 주소가 다르다.
		
	}

}
