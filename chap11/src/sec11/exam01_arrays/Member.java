package sec11.exam01_arrays;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		// a.compareTo(b) String의 compareTo 메소드는 a 알파벳이 더 뒤일 때 -1, 같을 때 0, 다를 때 1 리턴
	}
}
