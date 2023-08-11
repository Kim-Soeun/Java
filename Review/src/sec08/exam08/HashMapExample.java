package sec08.exam08;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("È«±æµ¿", 95);
		map.put("½Å¿ë±Ç", 85);
		map.put("µ¿Àå±º", 80);
		map.put("È«±æµ¿", 90);
		
		System.out.println("ÃÑ °³¼ö : " + map.size());
		
		System.out.println("È«±æµ¿ÀÇ Á¡¼ö : " + map.get("È«±æµ¿"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		map.remove("È«±æµ¿");
		System.out.println("ÃÑ °³¼ö : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
