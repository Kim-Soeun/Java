package sec02;

import java.util.Scanner;

public class 복합연산자 {

	public static void main(String[] args) {

//		숫자를 입력하세요
//		연산자를 입력하세요
//		예) 숫자 5, 연산자 -   입력했으면 복합연산자를 이용하여
//		100에서 5를 뺀 num1의 결과를 출력 num -=5
		
		
		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요");
		String str = s.next();

		if (str.equals("+")) { num1 += a; } 
		if (str.equals("-")) { num1 -= a; } 
		if (str.equals("*")) { num1 *= a; } 
		if (str.equals("/")) { num1 /= a; } 
		if (str.equals("%")) { num1 %= a; } 
		System.out.println("결과값은 : " + num1);
	}	
}