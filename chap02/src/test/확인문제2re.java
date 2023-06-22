package test;

import java.util.Scanner;

public class 확인문제2re {

	public static void main(String[] args) {

//		두 수를 입력받는다
//		첫 번째 수가 두 번째 수보다 크면 뺄셈 실행
//		첫 번째 수가 두 번째 수보다 작으면 덧셈 실행
//		예) 5,3  5-3=2        3,5  3+5 = 8
//		뺄셈 결과 : 2    		  덧셈 결과 : 8
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 수 :");
		String strNum1 = s.next();
		System.out.print("두 번째 수 :");
		String strNum2 = s.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result; 					// result를 정수로 미리 선언해두면 if안에서 모두 적용됨
		if(num1>num2) {
			result = num1 - num2;                  
			System.out.println("뺄셈 결과 :" + result);
		} else {
			result = num1 + num2;                   // result2로 적을 필요 x, if는 둘 중에 하나만 결과가 나오니까
			System.out.println("덧셈 결과 :" + result);
			
		}
	}

}
