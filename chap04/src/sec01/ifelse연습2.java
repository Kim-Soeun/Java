package sec01;

import java.util.Scanner;

public class ifelse연습2 {

	public static void main(String[] args) {

//		int 타입 변수 3개 선언
//		하나라도 6이하이면 불합격
//		3개 합해서 30이상이면 합격

		Scanner s = new Scanner(System.in);
		System.out.println("국어 : ");
		int num1 = s.nextInt();
		System.out.println("수학 : ");
		int num2 = s.nextInt();
		System.out.println("영어 : ");
		int num3 = s.nextInt();
		int sum = num1 + num2 + num3;

		if (num1 <= 6 || num2 <= 6 || num3 <= 6 || sum<30) {
			System.out.println("불합격입니다!");
		} else {
			System.out.println("합격입니다!");
		}
	}

}
