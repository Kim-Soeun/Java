package sec01;

import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("사용자 코드를 입력해 주세요");
		// 예) A115, B113, d119
		// 사용자 코드에서 맨 앞 영어 한 글자를 뽑아오세요
		// 영어가 a라면 " 인사부에 배정되셨습니다"
		// 영어가 b라면 " 기획부에 배정되셨습니다"
		// 영어가 c라면 " 총무부에 배정되셨습니다"

		String code = s.next();
		char a = code.charAt(0);

		switch (a) {
			case 'A':
			case 'a':
				System.out.println("인사부에 배정되셨습니다");
				break;
			case 'B':
			case 'b':
				System.out.println("기획부에 배정되셨습니다");
				break;
			default:
				System.out.println("총무부에 배정되셨습니다");
				break;
		}

	}

}
