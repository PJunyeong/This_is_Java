package sec04.exam01_objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "���ؿ�";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		
		System.out.println(Objects.toString(str1, "�̸��� ����"));
		System.out.println(Objects.toString(str2, "�̸��� ����"));
		//toString�� �� ù ��° �Ű������� null�� �� msg�� ǥ���Ѵ�.
	}

}
