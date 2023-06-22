package test;

import java.util.Scanner;

public class 확인문제2re2 {

	public static void main(String[] args) {

//		두 수를 입력받는다
//		첫 번째 수와 두 번째 수가 같으면   "두 수가 같아요"
//		첫 번째 수와 두 번째 수가 다르면   "두 수가 달라요"

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		String strNum1 = s.next();
		System.out.print("두 번째 수 : ");
		String strNum2 = s.next();

		if (strNum1.equals(strNum2)) {
			System.out.println("두 수가 같아요");
		} else {
			System.out.println("두 수가 달라요");
		}

	}
}
