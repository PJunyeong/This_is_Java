package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = {90, 84, 99, 75, 84};
		Arrays.sort(scores);
		
		int idx = Arrays.binarySearch(scores, 90);
		System.out.println(idx);
		
		idx = Arrays.binarySearch(scores, 91);
		System.out.println(idx);
		// Á¸Àç X
		
		String[] names = {"BBB", "AAA", "DDD", "EDGDG"};
		Arrays.sort(names);
		
		idx= Arrays.binarySearch(names, "DDD");
		System.out.println(idx);
		
		Member m1 = new Member("AAA");
		Member m2 = new Member("EEE");
		Member m3 = new Member("DDD");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		idx = Arrays.binarySearch(members, m2);
		System.out.println(idx);
	}

}
