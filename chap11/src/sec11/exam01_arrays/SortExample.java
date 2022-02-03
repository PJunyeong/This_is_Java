package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 91, 75, 99};
		Arrays.sort(scores);
		System.out.println(scores);
		
		String[] names = {"AAA", "EEE", "DDD"};
		Arrays.sort(names);
		for (String name: names) {
			System.out.println(name);
		}
		
		Member m1 = new Member("AAA");
		Member m2 = new Member("EEE");
		Member m3 = new Member("DDD");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for (Member member: members) {
			System.out.println(member.name);
		}
		// sort 시 Comparable 인터페이스가 필요하다
	}

}
