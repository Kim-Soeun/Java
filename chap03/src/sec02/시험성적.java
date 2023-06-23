package sec02;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("접속 비밀번호를 입력해 주세요");
		String pw= s.next();
		char pw1 = pw.charAt(0);
		char pw2 = pw.charAt(1);
		
		if ((pw1>=97) && (pw1<=122) && !(pw2<48) && !(pw2>57)) {
			System.out.println(name + "님 환영합니다");
		}	else {
			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다");
			
		}
		
		
		// 비밀번호는 영어 소문자와 숫자의 조합 예) a5, b7
		//사용자가 비밀번호를 옳게 입력하면 "환영합니다"
		//사용자가 비밀번호를 틀리게 입력하면 "비밀번호는 영어 소문자와 숫자의 조합입니다"
		
		
		
	}

}
