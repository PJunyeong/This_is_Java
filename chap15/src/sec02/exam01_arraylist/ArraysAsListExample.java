package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("박준영", "박준영2", "박준영3");
		for (String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(new Integer(1), new Integer(2));
		List<Integer> list3 = Arrays.asList(1, 2);
		for (Integer value: list2) {
			System.out.println(value);
		}
		for (int value: list3) {
			System.out.println(value);
		}
		
	}

}
