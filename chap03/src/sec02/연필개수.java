package sec02;

import java.util.Scanner;

public class 연필개수 {

	public static void main(String[] args) {

//		학생수 입력 받으세요
//		연필 개수 입력 받으세요
		
//		학생들에게 연필을 나눠주고 싶어요
//		학생수 10명이고 연필수 33개이면
//		한명당 3개씩 3개가 남아요
		
//		(출력문) 학생 한 명당 ~개씩 연필을 가져가고 ~개가 남아요
		
		Scanner s = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("연필 개수를 입력하세요");
		int num2 = s.nextInt();
		
		int result = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남아요\n", result, result2);
//		System.out.println("학생 한 명당 " + result + "개씩 연필을 가져가고 " + result2 + "개가 남아요");
	}

}
