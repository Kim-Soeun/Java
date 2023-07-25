package sec01;

import java.util.Scanner;

public class SubStringExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이메일을 입력해 주세요");
		String email = s.next();

		// 예) 이메일 : 12dk545@hanmail.net   -> 아이디만 추출해 보세요
		
		int location = email.indexOf("@");
		// 아이디 추출하기
		String id = email.substring(0, location);
		System.out.println("아이디 : " + id);

		// 도메인 추출하기
		String domain = email.substring(location);
		System.out.println("도메인 : " + domain);
		
	}

}
