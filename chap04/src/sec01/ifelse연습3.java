package sec01;

import java.util.Scanner;

public class ifelse연습3 {

	public static void main(String[] args) {

// 	7000원짜리 음료선물세트 구입했을 때 지불해야 하는 금액 계산 프로그램 만들기
//	단, 8개 이상 구매 시에는 10% 할인	

		Scanner s = new Scanner(System.in);
		System.out.println("음료 갯수 : ");
		int num = s.nextInt();
		int result = num * 7000;
		
		if (num<8) {
			System.out.println("가격은 " + result + "원 입니다.");
		}	else {
//			result -= result/10;   이런 식도 가능
			result = num*6300;
			System.out.println("가격은 " + result + "원 입니다");
		}

		
	}

}
