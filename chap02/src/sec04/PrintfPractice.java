package sec04;

import java.util.Scanner;

public class PrintfPractice {

	public static void main(String[] args) {

//		이름을 입력하세요 예)장동건
//		나이를 입력하세요 예)26

//	순번   이름    나이
//	1    장동건	 26
		
//	순번 %d 왼쪽맞춤 자리수 3자리
//	이름 %s
//	나이 %d 오른쪽 맞춤 자리수 3자리
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String str = s.next();
		
		System.out.println("나이를 입력하세요");
		int a = s.nextInt();
		
		System.out.println("순번\t이름\t나이");
		System.out.printf("%-3d\t%s\t%3d",1 ,str, a);
		
	}
	

}
