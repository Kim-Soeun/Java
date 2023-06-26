package sec01;

import java.util.Scanner;

public class switch연습3 {

	public static void main(String[] args) {

//		수험번호를 입력받습니다
//		수험번호는 숫자 6자리와 영어대문자 조합입니다 예)123456A
//		수험번호 끝자리가 A이면 "시험장소가 201호입니다"
//		수험번호 끝자리가 B이면 "시험장소가 202호입니다"
//		수험번호 끝자리가 C이면 "시험장소가 203호입니다"
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("수험번호 : " );
		String num = s.next();
		char a = num.charAt(6);

		switch (a) {
		case 'A':
			System.out.println("시험장소가 201호 입니다");
			break;
		case 'B':
			System.out.println("시험장소가 202호입니다");
			break;
		default:
			System.out.println("시험장소가 203호입니다");
			break;
		}
	}
}
