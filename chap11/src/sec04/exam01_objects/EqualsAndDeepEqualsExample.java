package sec04.exam01_objects;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		// Integer 객체 생성
		System.out.println(Objects.equals(o1, o2));
		// 내부 정수값이 같다면 true를 리턴한다. Integer에 overriding된 equals 메소드를 호출하기 때문이다.
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		// null, null을 equals로 비교할 때 true를 리턴한다.
		
		System.out.println(Objects.deepEquals(o1,  o2));
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};	
		System.out.println(Objects.equals(arr1, arr2));
		// 객체 번지가 다르므로 false 리턴한다.
		System.out.println(Objects.deepEquals(arr1, arr2));
		// 배열 내 값이 모두 같기 때문에 true를 리턴한다. 
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
	}

}
