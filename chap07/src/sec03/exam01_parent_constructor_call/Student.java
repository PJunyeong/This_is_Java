package sec03.exam01_parent_constructor_call;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		// 기본 생성자로 상속을 할 수 없으므로 super를 통해 상속받는다.
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}

}
