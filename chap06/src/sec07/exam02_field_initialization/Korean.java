package sec07.exam02_field_initialization;

public class Korean {
	String nation = "대한민국";
	// 초기값
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// 파라미터와 필드명을 구별하기 위한 this.필드명 호출이 관례적인 사용 방법.
	}
	// 생성자 이름은 클래스 이름과 동일. 생성자에서 name, ssn 필드를 초기화한다. 

}
