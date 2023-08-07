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
		
		set.add("�ڹ�");
		set.add("���̵��");
		set.add("����");
		set.add("���̹�Ƽ��");
		set.add("���̵��");			// ���� �����ʹ� �߰� �ȵ�
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
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
