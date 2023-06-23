package sec02;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) {

//		129p 확인문제 9번

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수 : ");
		String num1 = s.next();
		
		System.out.println("두번째 수 : ");
		String num2 = s.next();
		
		double num3 = Double.parseDouble(num1);
		double num4 = Double.parseDouble(num2);
		double result = num3 / num4;
		
		String result2 = (num4 == 0) ? "무한대" : String.valueOf(result);
		System.out.println("결과 : " + result2);
	}

}
