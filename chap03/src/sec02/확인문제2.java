package sec02;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {

//		129p 확인문제 9번
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수 : ");
		double num1 = Double.parseDouble(s.next());
		
		System.out.println("두번째 수 : ");
		double num2 = Double.parseDouble(s.next());
		
		double result = num1 / num2;
		String result2 = (num2 == 0) ? "무한대" : String.valueOf(result); // String.valueof() : 숫자 -> 문자열
		System.out.println("결과 : " + result2);
		
	}	

}
