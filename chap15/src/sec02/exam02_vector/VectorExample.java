package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for (Board board : list) {
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
		
		list.remove(4);
		for (Board board : list) {
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
		
		
	}

}
