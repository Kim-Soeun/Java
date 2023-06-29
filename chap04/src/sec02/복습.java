package sec02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

//		1~20 숫자 입력
//		1~20 숫자 랜덤 지정
//		사용자 숫자=컴퓨터 숫자  : "정답입니다"
//		오답일 때는 힌트 주고 다시 입력

		Scanner s = new Scanner(System.in);
		
		int b = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.println("사용자 숫자 : ");
			int a = s.nextInt();
			if (a == b) {
				System.out.println("정답");
				break;
			} else if (a > b) {
				System.out.println("사용자 숫자가 더 큼");
			} else {
				System.out.println("사용자 숫자가 더 작음");
			}
		}

	}

}
