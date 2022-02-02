package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���~";
		byte[] bytes1 = str.getBytes();
		System.out.println("length: " + bytes1.length);
		// ����� 1����Ʈ, �ѱ��� 2����Ʈ
		String str1 = new String(bytes1);
		System.out.println(str1);
		try {
//			byte[] bytes2 = str.getBytes("EUC-KR");
//			System.out.println("length: " + bytes2.length);
			
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("length: " + bytes2.length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
