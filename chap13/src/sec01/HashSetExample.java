package sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Set 컬렉션 
		// 저장 순서가 유지되지 않음
		// 객체를 중복해서 저장할 수 없음
		

		Set<String> set = new HashSet<>();
		
		set.add("자바");
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("아이바티스");
		set.add("제이디비씨");			// 같은 데이터는 추가 안됨
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();		// 위와 같음
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();				// 모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
	}

}
