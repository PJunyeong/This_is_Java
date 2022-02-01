package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "���ؿ�";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		try {
			System.out.println(Objects.requireNonNull(str2, "no name!"));
			//requireNonNull(para1, para2)���� para2�� msg.
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			// str2�� null�̱� ������ ���� �߻���
		}
		
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"no name!"));
			//���ٽ� ���
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			// str2�� null�̱� ������ ���� �߻���
		}
		
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	}

}
