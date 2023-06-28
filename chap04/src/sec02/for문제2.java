package sec02;

import java.util.Scanner;

public class for문제2 {

	public static void main(String[] args) {

//  구구단 단수 입력 
//	예) 4*1 = 4
//	예) 4*2 = 8
		

		Scanner s = new Scanner(System.in);
		System.out.println("구구단 단수를 입력하세요");
		int num = s.nextInt();
		System.out.println("구구단 " + num + "단");
	

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + " = " + (num*i));
		}

	}

}
