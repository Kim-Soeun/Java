package sec02;

import java.util.Scanner;

public class for문제1 {

	public static void main(String[] args) {

//	30 이하의 다른 정수 2개를 입력 두 수 사이의 총 합을 출력하는 프로그램을 작성해보세요(for문)
//		예) 정수입력1 : 5
//			정수입력2 : 9
//			5+6+7+8+9 = 35

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int a = s.nextInt();
		System.out.print("정수 입력2 : ");
		int b = s.nextInt();
		int large = 0;
		int small = 0;
		int sum = 0;

		if (a > b) {
			large = a;
			small = b;
		} else {
			large = b;
			small = a;
		}

		for (int i = small; i <= large; i++) {
			sum += i;
			if (i == large) {
				System.out.print(i + "=" + sum);
			} else {
				System.out.print(i + "+");
			}
		}
	}

}
