package sec08.exam14;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list = new Vector<>();
		
		list.add(new Board("����1", "����1", "�۰�1"));
		list.add(new Board("����2", "����2", "�۰�2"));
		list.add(new Board("����3", "����3", "�۰�3"));
		list.add(new Board("����4", "����4", "�۰�4"));
		list.add(new Board("����5", "����5", "�۰�5"));
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.err.println(board.title + "\t" + board.content + "\t" + board.writer);
		}
		
		for(Board board2 : list) {
			System.out.println(board2.title + "\t" + board2.content + "\t" + board2.writer);
		}
		
		
	}

}
