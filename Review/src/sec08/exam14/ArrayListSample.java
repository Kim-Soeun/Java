package sec08.exam14;

import java.util.*;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		// 총 개수
		System.out.println("총 개수 : " + list.size());
		
		// 2번 인덱스 데이터 가져오기
		System.out.println("2 : " + list.get(2));
		
		// 모든 데이터 가져오기
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// 객체 삭제
		list.remove(2);
		list.remove("iBATIS");
		
		// 삭제 후 남은 모든 데이터 가져오기
		for(int i=0; i<list.size(); i++) {
			System.out.println(i +" : " + list.get(i));
		}
		
	}

}
