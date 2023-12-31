package sec08.exam14;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("���屺", 80);
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("ȫ�浿", 95);
		
		System.out.println("�� Entry ���� : " + map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry ���� : " + map.size());
		
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
