package sec08.exam14;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>();
		
		set.add("자바");
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("아이바티스");
		set.add("제이디비씨");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
