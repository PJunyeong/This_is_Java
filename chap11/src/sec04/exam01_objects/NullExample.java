package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "박준영";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		try {
			System.out.println(Objects.requireNonNull(str2, "no name!"));
			//requireNonNull(para1, para2)에서 para2는 msg.
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			// str2가 null이기 때문에 예외 발생함
		}
		
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"no name!"));
			//람다식 사용
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			// str2가 null이기 때문에 예외 발생함
		}
		
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
