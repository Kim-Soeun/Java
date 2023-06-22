package test;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {

//			98p
//		1번문제 : Scanner 활용
//		당신의 이름은? 이름 입력 받기   	 string
//		당신의 나이는?                	int
//		당신의 휴대폰 번호 가운데 4자리는?  string
//		당신의 휴대폰 번호 끝 4자리는? 	string
		
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("당신의 나이는?");
		int age = s.nextInt();
		System.out.println("당신의 휴대폰 번호 가운데 4자리는?");
		String phone = s.next();
		System.out.println("당신의 휴대폰 번호 끝 4자리는?");
		String phone2 = s.next();
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("전화 : 010 - %s - %s",phone, phone2);
		
	}

}
