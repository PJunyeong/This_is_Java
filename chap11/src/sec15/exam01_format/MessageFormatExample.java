package sec15.exam01_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "Java";
		String name = "���ؿ�";
		String tel = "010-1234-5678";
		
		String text = "ȸ�� ID: {0} \nȸ�� �̸�: {1}\n��ȭ ��ȣ: {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "INSERT INTO member VALUES({0}, {1}, {2})";
		Object[] arguments = {id, name, tel};
		String result2 = MessageFormat.format(sql,  arguments);
		System.out.println(result2);
	}

}
