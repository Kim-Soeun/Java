package sec01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// ArrayList와 LinkedList에 10,000개의 객체를 삽입하는 데
		// 걸린 시간을 축정한 것
		// 0번 인덱스에 String 객체를 10,000번 추가하기 위해 
		// List 인터페이스의 add()메소드를 이용함
		// 실행결과 LinkedList가 훨씬 빠른 성능 보임

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + "ns");
		
	}

}
