package sec03.exam01_equals;

public class Member extends Object{
	// Object는 extends를 붙이지 않아도 된다.
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	
}
