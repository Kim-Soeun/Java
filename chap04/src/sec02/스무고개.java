package sec02;

import java.util.Scanner;

public class 스무고개 {

	public static void main(String[] args) {

		
//		1~20 숫자 입력
//		1~20 숫자 랜덤 지정
//		사용자 숫자=컴퓨터 숫자  : "정답입니다"
//		오답일 때는 힌트 주고 다시 입력
		
		Scanner s = new Scanner(System.in);

		// 랜덤으로 숫자 추출 (1~20)
		int comNum = (int) (Math.random() * 20) + 1;
		

		while (true) {
			System.out.println("숫자 하나를 입력하세요(1~20)");
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("정답입니다");
				break;
			} else if (userNum > comNum) {
				System.out.println("사용자 숫자는 컴퓨터 숫자보다 큽니다");
			} else {
				System.out.println("사용자 숫자는 컴퓨터 숫자보다 작습니다");
			}
		}

	}

}
