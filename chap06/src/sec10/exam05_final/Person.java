package sec10.exam05_final;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	void getInfo() {
		System.out.println(this.nation);
		System.out.println(this.ssn);
		System.out.println(this.name);
	}

}
