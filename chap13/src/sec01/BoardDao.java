package sec01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {			// 581p 7�� ����

	public List<Board2> getBoardList() {
		
		List<Board2> list = new ArrayList<>();
		list.add(new Board2("����1", "����1"));
		list.add(new Board2("����2", "����2"));
		list.add(new Board2("����3", "����3"));
		return list;
	}
	
	
}
