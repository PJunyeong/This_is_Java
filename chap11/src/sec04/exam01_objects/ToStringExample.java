package sec04.exam01_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "박준영";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		
		System.out.println(Objects.toString(str1, "이름이 없음"));
		System.out.println(Objects.toString(str2, "이름이 없음"));
		//toString일 때 첫 번째 매개변수가 null일 때 msg를 표시한다.
	}

}
