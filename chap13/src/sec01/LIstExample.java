package sec01;

import java.util.*;

public class LIstExample {		// 581p 7¹ø ¹®Á¦

	public static void main(String[] args) {

		BoardDao dao = new BoardDao();
		List<Board2> list = dao.getBoardList();
		for(Board2 board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
		
		
	}

}
