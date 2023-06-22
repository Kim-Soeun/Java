package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {
		
//		두 수를 입력 받습니다.
//		단, next()이용하여 문자열로 입력받음
//		입력받은 문자열을 parseInt 이용하여 숫자로 형변환 시키세요
//		예) 두 수의 합계는 : 66입니다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		String a = s.next();
		int b = Integer.parseInt(a);// Integer.parseInt = 문자열 -> 숫자(int) 
									// String.valueOf(타입값) = 타입값 -> 문자
		
		System.out.println("두번째 숫자를 입력하세요.");
		String c = s.next();
		int d = Integer.parseInt(c);
		
		int sum = b + d;
		System.out.println("두 수의 합계는 : " + sum + "입니다.");
		
//		11번 문제
		byte value = Byte.parseByte("10");
		
	}

}
