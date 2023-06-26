package sec01;

import java.util.Scanner;

public class ifelse연습1 {

	public static void main(String[] args) {

//		num이 홀수인지 짝수인지 판별하여 아래와 같은 실행 결과가 나오도록 프로그램을 만들어보세요
//		예) 정수를 입력하세요: 42"
//		"42는 짝수입니다
//		예) 정수를 입력하세요: 71"
//		"71은 홀수입니다

		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = s.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "는 짝수입니다");
		} else {
			System.out.println(num + "는 홀수입니다");
		}
	}

}
