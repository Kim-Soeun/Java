package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {

//		숫자 2개를 입력하세요
//		연산자를 입력하세요 ( +, -, *, /)
//		예) 5,2, +  -> 7
//		예) 2,5,-  -> 3
//		예) 5,2,*  -> 10
//		예) 5,2,/  ->2.5

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = s.nextInt();
		System.out.println("연산자를 입력하세요( +, -, *, /)");
		String str = s.next();

		int temp;
		int result;
		double result2;

		if (num2 > num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (str.equals("+")) {
			result = num1 + num2;
			System.out.println(result);
		}
		if (str.equals("-")) {
			result = num1 - num2;
			System.out.println(result);
		}
		if (str.equals("*")) {
			result = num1 * num2;
			System.out.println(result);
		}
		if (str.equals("/")) {
			result2 = num1 / num2;
			System.out.println(result2);
		}

	}
}
