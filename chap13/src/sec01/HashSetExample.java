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
		Set<String> set2 = new HashSet<>();
		
		set.add("자바");
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("아이바티스");
		set.add("제이디비씨");			// 같은 데이터는 추가 안됨
		
		set.add("핫도그");
		set.add("라면");
		set.add("아이스크림");
		set.add("아이스크림");
		
		
		
		Iterator<String> iter = set.iterator(); // HashSet을 Iterator 객체로 생성
		while(iter.hasNext()) {					// 요소 하나씩 출력  hasNext : 다음요소가 존재하면 true, 아니면 false
			String element = iter.next(); 		// 요소 하나 가져옴
			System.out.println(element);
		}
		
		
		// 주어진 코드를 실행하면, 요소들이 추가된 순서와는 무관하게 어떤 순서로 출력될지
		// 정확히 예측 x
		// Set 구현체에 따라 출력순서 달라질 수 있음
		
		
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
