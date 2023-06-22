package test;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {

//		99p 2번 문제  
//		첫 번째 수 : (입력)
//		두 번째 수 : (입력)
//		덧셈 결과 : (출력) 
		
			Scanner s = new Scanner(System.in);
			System.out.print("첫 번째 수 :");
			String strNum1 = s.next();
			System.out.print("두 번째 수 :");
			String strNum2 = s.next();
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			int result = num1 + num2;
			System.out.println("덧셈 결과 :" + result);
			
	}

}
