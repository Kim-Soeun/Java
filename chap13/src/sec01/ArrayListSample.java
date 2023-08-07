package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");			// 0��° ��
		list.add("JDBC");			// 1��° ��
		list.add("Servlet/JSP");	// 2��° �濡�� 3��° ������ �и�
		list.add(2,"Database");		// 2��° �濡 database �߰�
									// ���� �ִ� servlet�� �з��� 3���� ��
		
		list.add("iBATIS");
		
		int size = list.size();		// list �� ����
		System.out.println("�� ��ü�� : " + size);
		
		String skill = list.get(2);	// 2��° �� ������ ��������
		System.out.println("2 : " + skill);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			
		}

		
		list.remove(2);				// 2��° �� ������ ����(Database)
		list.remove(2);				// 2��° �� ������ ����(Servlet)
		list.remove("iBATIS");		// �������� ���� ������
		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		
	}

}
