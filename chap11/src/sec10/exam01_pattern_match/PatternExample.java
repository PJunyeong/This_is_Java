package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// \�� ǥ���ϱ� ���� \�� �ϳ� �� �ִ´�.
		String data = "010-7425-215";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("matches");
		} else {
			System.out.println("matches X");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "asd@naver.co.kr";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("matches");
		} else {
			System.out.println("matches X");
		}
	}

}
