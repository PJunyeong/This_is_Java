package verify.Exercise08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		String[] tokens = str.split(",");
		for (String token: tokens) {
			System.out.println(token);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
