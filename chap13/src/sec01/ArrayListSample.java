package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");			// 0번째 방
		list.add("JDBC");			// 1번째 방
		list.add("Servlet/JSP");	// 2번째 방에서 3번째 방으로 밀림
		list.add(2,"Database");		// 2번째 방에 database 추가
									// 원래 있던 servlet이 밀려서 3번이 됨
		
		list.add("iBATIS");
		
		int size = list.size();		// list 의 개수
		System.out.println("총 객체수 : " + size);
		
		String skill = list.get(2);	// 2번째 방 데이터 가져오기
		System.out.println("2 : " + skill);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			
		}

		
		list.remove(2);				// 2번째 방 데이터 삭제(Database)
		list.remove(2);				// 2번째 방 데이터 삭제(Servlet)
		list.remove("iBATIS");		// 내용으로 삭제 가능함
		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
	}

}
