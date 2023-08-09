package sec01;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		
		// ��ü �߰�
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);	// ������ Ű�� ������ �������� ������ ������ ��ü
		
		
		// ����� �� Entry �� ���
		System.out.println("�� Entry ���� : " + map.size());
		
		
		// ��ü ã��
		System.out.println("ȫ�浿�� ���� : " + map.get("ȫ�浿")); // key(�̸�)���� ��(����) �˻�
		
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();					  // Key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); 				 // �ݺ��ؼ� Ű�� ����
			// �ݺ��ؼ� Ű ������
			Integer value = map.get(key);					 // ���� Map���� ����
			// �ݺ��ؼ� �� ������
			System.out.println(key + " : " + value);
		}
		
		
		// ��ü ����
		map.remove("ȫ�浿");		// ȫ�浿 ���� & ���� Ű : 95, 90
		System.out.println("�� Entry ���� : " + map.size());
		
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  // Map.Entry Set ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		
		
	}

}
