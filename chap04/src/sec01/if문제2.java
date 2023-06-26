package sec01;

import java.util.Scanner;

public class if문제2 {

	public static void main(String[] args) {

//		num이 3의 배수라면 "3의 배수입니다"
		Scanner s = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num = s.nextInt();

		if (num % 3 == 0 && num != 0) {
//			num!=0 은 0을 숫자로 입력했을 때를 대비해 적어주는 조건
			System.out.println("3의 배수입니다.");
		}	else {
			System.out.println("3의 배수가 아닙니다");
		}

	}

}
