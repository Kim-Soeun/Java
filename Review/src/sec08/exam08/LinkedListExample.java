package sec08.exam08;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list.add(0, i);
		}
		
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 소요 시간 : " + (endTime - startTime) + "ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, i);
		}
		
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "ns");
		
		
	}

}
