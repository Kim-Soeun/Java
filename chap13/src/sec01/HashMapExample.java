package sec01;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		
		// 객체 추가
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 동일한 키가 있으면 마지막에 저장한 값으로 대체
		
		
		// 저장된 총 Entry 수 얻기
		System.out.println("총 Entry 개수 : " + map.size());
		
		
		// 객체 찾기
		System.out.println("홍길동의 점수 : " + map.get("홍길동")); // key(이름)으로 값(점수) 검색
		
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();					  // Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); 				 // 반복해서 키를 얻음
			// 반복해서 키 가져옴
			Integer value = map.get(key);					 // 값을 Map에서 얻음
			// 반복해서 값 가져옴
			System.out.println(key + " : " + value);
		}
		
		
		// 객체 삭제
		map.remove("홍길동");		// 홍길동 제거 & 남은 키 : 95, 90
		System.out.println("총 Entry 개수 : " + map.size());
		
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  // Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		
		
	}

}
