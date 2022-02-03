package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		//���� ���� (����)
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println(original.equals(clone1));
		// Object.equals == '=='
		System.out.println(Arrays.equals(original, clone1));
		// Arrays�� equals�� '��'�� �����ϸ� true ����
		System.out.println(Arrays.deepEquals(original, clone1));
		
		//���� ����
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println(original.equals(clone2));
		System.out.println(Arrays.equals(original, clone2));
		// equals �޼ҵ�� '���� ��'�� ���ϹǷ� false ����
		System.out.println(Arrays.deepEquals(original, clone2));
		// original�� clone2�� �����ϴ� �迭�� '��'�� ���ϹǷ� true ����
	}
}
