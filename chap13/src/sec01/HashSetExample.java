package sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Set �÷��� 
		// ���� ������ �������� ����
		// ��ü�� �ߺ��ؼ� ������ �� ����
		

		Set<String> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set.add("�ڹ�");
		set.add("���̵��");
		set.add("����");
		set.add("���̹�Ƽ��");
		set.add("���̵��");			// ���� �����ʹ� �߰� �ȵ�
		
		set.add("�ֵ���");
		set.add("���");
		set.add("���̽�ũ��");
		set.add("���̽�ũ��");
		
		
		
		Iterator<String> iter = set.iterator(); // HashSet�� Iterator ��ü�� ����
		while(iter.hasNext()) {					// ��� �ϳ��� ���  hasNext : ������Ұ� �����ϸ� true, �ƴϸ� false
			String element = iter.next(); 		// ��� �ϳ� ������
			System.out.println(element);
		}
		
		
		// �־��� �ڵ带 �����ϸ�, ��ҵ��� �߰��� �����ʹ� �����ϰ� � ������ ��µ���
		// ��Ȯ�� ���� x
		// Set ����ü�� ���� ��¼��� �޶��� �� ����
		
		
		iter = set.iterator();		// ���� ����
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();				// ��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("�������");
		}
		
		
	}

}
