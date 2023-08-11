package sec08.exam08;

import java.util.*;

public class HashExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("�ڹ�");
		set.add("���̵��");
		set.add("���̹�Ƽ��");
		set.add("����");
		set.add("���̵��");

		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
			}
		
		iter = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�������");
		}
		
	}

}
