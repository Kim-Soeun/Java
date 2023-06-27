package sec02;

import java.util.Scanner;

public class for문예제5 {

	public static void main(String[] args) {

//	100 이하의 다른 정수 2개를 입력 받아 홀수인 수를 작은 수부터 큰 수까지 출력하는 프로그램을 작성해보세요(for문 사용)
//		정수입력1 : 20,   정수입력2 : 30  ->  21 23 25 27 29 
//		정수입력1 : 30,   정수입력2 : 20  ->  21 23 25 27 29

		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int a = s.nextInt();
		System.out.print("정수 입력 2 : ");
		int b = s.nextInt();
		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
