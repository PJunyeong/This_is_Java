package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "AAA/BBB/CCC";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		// cnt�� for �� ������
		int countTokens = st.countTokens();
		for (int i = 0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// hasMoreTokens�� while �� ������
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
