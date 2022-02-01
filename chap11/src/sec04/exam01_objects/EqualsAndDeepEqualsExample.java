package sec04.exam01_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		// Integer ��ü ����
		System.out.println(Objects.equals(o1, o2));
		// ���� �������� ���ٸ� true�� �����Ѵ�. Integer�� overriding�� equals �޼ҵ带 ȣ���ϱ� �����̴�.
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		// null, null�� equals�� ���� �� true�� �����Ѵ�.
		
		System.out.println(Objects.deepEquals(o1,  o2));
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};	
		System.out.println(Objects.equals(arr1, arr2));
		// ��ü ������ �ٸ��Ƿ� false �����Ѵ�.
		System.out.println(Objects.deepEquals(arr1, arr2));
		// �迭 �� ���� ��� ���� ������ true�� �����Ѵ�. 
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
	}

}
