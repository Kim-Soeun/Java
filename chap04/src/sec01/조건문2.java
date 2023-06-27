package sec01;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요");
		String code = s.next();
		char part = code.charAt(0);
		String position = code.substring(1,3);
		
		
		// 직원코드는 A부장1234, B과장4567, C차장9874
		// A 인사부 B 기획부 C 총무부
		// 보너스 금액 : 부장 100만원, 과장 70만원, 차장 50만원
		// 예) A부장1234 -> 인사부 부장님 보너스 금액은 100만원 입니다.
		// 문자열 특정 부분 추출 -> substring
		
		switch (part) {
		case 'A' :
		case 'a' :
			System.out.print("인사부 ");
			break;
		case 'B' :
		case 'b' :
			System.out.print("기획부 ");
			break;
		default :
			System.out.print("총무부 ");
			break;
		}
		
		switch (position) {
		case "부장" :
			System.out.printf("%s님 보너스 금액은 100만원 입니다.", position);
			break;
		case "과장" :
			System.out.printf("%s님 보너스 금액은 70만원 입니다.", position);
			break;
		default :
			System.out.printf("%s님 보너스 금액은 50만원 입니다.", position);
		}
			
	}

}
