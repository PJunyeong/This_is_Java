package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		for (Board board : list) {
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
		
		list.remove(4);
		for (Board board : list) {
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
		
		
	}

}
