package sec08.exam14;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// ArrayList�� LinkedList�� 10,000���� ��ü�� �����ϴ� ��
		// �ɸ� �ð��� ������ ��
		// 0�� �ε����� Integer ��ü�� 10,000�� �߰��ϱ� ���� 
		// List �������̽��� add()�޼ҵ带 �̿���
		// ������ LinkedList�� �ξ� ���� ���� ����

		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ҿ� �ð� : " + (endTime - startTime) + "ns");
		
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ҿ� �ð� : " + (endTime - startTime) + "ns");
		
	}

}
