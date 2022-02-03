package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "AAA/BBB/CCC";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		// cnt로 for 문 돌리기
		int countTokens = st.countTokens();
		for (int i = 0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// hasMoreTokens로 while 문 돌리기
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
