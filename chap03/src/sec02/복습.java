package sec02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

//		숫자를 입력하세요
//		연산자를 입력하세요
//		예) 숫자 5, 연산자 -   입력했으면 복합연산자를 이용하여
//		100에서 5를 뺀 num1의 결과를 출력 num -=5
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요");
		String b = s.next();
		int num =100;
		
		if (b.equals("-")) { num -=a; }
		if (b.equals("+")) { num +=a; }
		if (b.equals("*")) { num *=a; }
		if (b.equals("/")) { num /=a; }
		
		
		
	}
}
