package sec08.exam14;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {

		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "작가1"));
		list.add(new Board("제목2", "내용2", "작가2"));
		list.add(new Board("제목3", "내용3", "작가3"));
		list.add(new Board("제목4", "내용4", "작가4"));
		list.add(new Board("제목5", "내용5", "작가5"));
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.err.println(board.title + "\t" + board.content + "\t" + board.writer);
		}
		
		for(Board board2 : list) {
			System.out.println(board2.title + "\t" + board2.content + "\t" + board2.writer);
		}
		
		
	}

}
