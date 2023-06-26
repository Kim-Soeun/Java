package sec01;

import java.util.Scanner;

public class if문제3 {

	public static void main(String[] args) {

//		num이 2의 배수이면서 5이 배수라면 "2와 5의 배수입니다."
		Scanner s = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = s.nextInt();

		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2와 5의 배수입니다.");
		} else {
			System.out.println("2와 5의 배수가 아닙니다");
		}

	}

}
