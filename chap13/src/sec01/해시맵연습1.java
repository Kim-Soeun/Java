package sec01;

import java.util.*;

public class 해시맵연습1 {

	// 나라와 인구수를 스캐너 이용하여 3개를 입력 받으세요
	// 예) 한국 5000, 일본 1200, 중국 30000
	// 해당 데이터를 해시맵으로 저장한 후
	// 사용자가 나라 이름을 입력하면 인구수를 출력하는 코드를 작성하세요
	// 사용자가 그만이라고 입력하면 중지하세요

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		
		
		System.out.println("나라와 인구수를 3개 입력하세요");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "번째 : ");
			map.put(s.next(), s.nextInt());
		}

		
		
		while (true) {

			System.out.println("나라를 입력하세요");
			String country = s.next();

			if (country.equals("그만")) {
				System.out.println("검색을 종료합니다");
				break;
			}
			
			if (map.containsKey(country)) {
				System.out.println(country + " 인구수 : " + map.get(country));
			} else {
				System.out.println("해당 나라가 없어요");
			}

		}

	}

}
