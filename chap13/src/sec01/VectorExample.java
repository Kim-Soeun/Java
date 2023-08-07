package sec01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		// Vector 
		// 동기화된 메소드로 구성
		// 멀티 스레드가 동시에 Vector 메소드들 실행 할 수 없음

		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t" + board.content+"\t" +board.writer);
		}
		
		for(Board board2 : list) {			// 위와 같음
			System.out.println(board2.subject+"\t"+ board2.content+"\t" +board2.writer);
		}
		
	}

}
