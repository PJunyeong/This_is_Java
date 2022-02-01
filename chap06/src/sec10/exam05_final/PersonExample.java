package sec10.exam05_final;

public class PersonExample {

	public static void main(String[] args) {
		Person me = new Person("12345678-12345678", "박준영");
		me.getInfo();
		// me.nation = "USA";
		// nation, ssn 등은 final 필드이므로 초기화 이후 수정 불가능
		
	}

}
