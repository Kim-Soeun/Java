package sec08.exam08;

import java.util.*;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("JDBC");			
		list.add("Servlet/JSP");	
		list.add(2,"Database");	
		
		list.add("iBATIS");

		
		System.out.println("총 객체수 : " + list.size());
		
		System.out.println("2번째 방 데이터 : " + list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번째 방 데이터 : " + list.get(i));
		}
		
		list.remove(2);
		System.out.println("2번째 방 데이터 : " + list.get(2));

		
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++ ) {
			System.out.println(i + " : " + list.get(i));
		}
		
		
		
	}

}
