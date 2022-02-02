package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요~";
		byte[] bytes1 = str.getBytes();
		System.out.println("length: " + bytes1.length);
		// 영어는 1바이트, 한글은 2바이트
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
