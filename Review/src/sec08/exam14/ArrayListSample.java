package sec08.exam14;

import java.util.*;

public class ArrayListSample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		// �� ����
		System.out.println("�� ���� : " + list.size());
		
		// 2�� �ε��� ������ ��������
		System.out.println("2 : " + list.get(2));
		
		// ��� ������ ��������
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// ��ü ����
		list.remove(2);
		list.remove("iBATIS");
		
		// ���� �� ���� ��� ������ ��������
		for(int i=0; i<list.size(); i++) {
			System.out.println(i +" : " + list.get(i));
		}
		
	}

}
