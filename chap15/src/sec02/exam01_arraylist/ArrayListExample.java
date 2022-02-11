package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		// ��� �ִ� '������' �ε����� �����Ѵ�.
		list.add("JDBC");
		list.add("Servelet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		
		System.out.println("total size: " + size);
		
//		for (String str: list) {
//			System.out.println(str);
//		}
		
		for (int i = 0; i<size; i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		//Database �����ǰ� �� ĭ�� �з�����.
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
		
		list.remove("JDBC");
		// idx�� �ƴ϶� ������ �����Ѵ�.
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
	}

}
