package sec03.exam07;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {

//		두 수를 입력 받습니다.
//		단, next()이용하여 문자열로 입력받음
//		입력받은 문자열을 parseInt 이용하여 숫자로 형변환 시키세요
//		예) 두 수의 합계는 : 66입니다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		String str = s.next();
		int b = Integer.parseInt(str);

		System.out.println("첫번째 숫자를 입력하세요");
		String str2 = s.next();
		int c = Integer.parseInt(str2);
		
		int d = b + c;
		System.out.println("두 수의 합계는 : " + d + "입니다.");
		
	}

}
