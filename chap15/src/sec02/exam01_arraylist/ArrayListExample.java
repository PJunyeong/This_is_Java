package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		// 비어 있는 '마지막' 인덱스에 저장한다.
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
		//Database 삭제되고 한 칸씩 밀려진다.
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
		
		list.remove("JDBC");
		// idx가 아니라 값으로 삭제한다.
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println("list[" + i + "]: " + list.get(i));
		}
	}

}
