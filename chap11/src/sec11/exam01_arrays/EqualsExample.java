package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		//얕은 복제 (번지)
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println(original.equals(clone1));
		// Object.equals == '=='
		System.out.println(Arrays.equals(original, clone1));
		// Arrays의 equals는 '값'이 동일하면 true 리턴
		System.out.println(Arrays.deepEquals(original, clone1));
		
		//깊은 복제
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println(original.equals(clone2));
		System.out.println(Arrays.equals(original, clone2));
		// equals 메소드는 '번지 수'로 비교하므로 false 리턴
		System.out.println(Arrays.deepEquals(original, clone2));
		// original과 clone2가 참조하는 배열의 '값'을 비교하므로 true 리턴
	}
}
