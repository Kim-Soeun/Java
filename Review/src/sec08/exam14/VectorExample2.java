package sec08.exam14;

import java.util.*;

public class VectorExample2 {

	public static void main(String[] args) {

		// Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아
		// 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요
	
		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();
		
		
		while(true) {
			System.out.println("양의 정수를 입력하세요");
			System.out.println("-1을 입력하면 멈춥니다");
			int num = s.nextInt();
			if(num == -1) break;
			list.add(num);
		}
		
		
		int max = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("가장 큰 수 : " + max);
		
	}

}
