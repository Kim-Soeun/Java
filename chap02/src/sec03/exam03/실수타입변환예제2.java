package sec03.exam03;

import java.util.Scanner;

public class 실수타입변환예제2 {

	public static void main(String[] args) {
		//첫번째 숫자 입력하세요
		// 예) 5
		// 두번째 숫자 입력하세요
		// 예) 2
		//입력하신 두 수의 나누기 결과는  2.5입니다
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력하세요");
		int a = s.nextInt();
		
		System.out.println("두번째 숫자 입력하세요");
		int b = s.nextInt();
		
		double c = (double)a / (double)b; //double c = (double) a / b; 이렇게도 가능
		
		System.out.println("입력하신 두 수의 나누기 결과는 " + c + "입니다.");
		
	}

}
