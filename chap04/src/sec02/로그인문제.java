package sec02;

import java.util.Scanner;

public class 로그인문제 {

	public static void main(String[] args) {

//		아이디 : abc  비밀번호 : 1234
//		사용자로부터 아이디와 비밀번호를 입력받으세요
//		아이디는 맞지만 비밀번호가 다르면 "비밀번호가 달라요"
//		아이디가 존재하지 않으면 "아이디가 존재하지 않습니다"
//		로그인이 될때까지 무한 반복
//		아이디, 비밀번호 모두 맞으면 "환영합니다" 출력후 종료

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 : ");
			String user_id = s.next();
			System.out.print("비밀번호 : ");
			String password = s.next();

			if (user_id.equals("abc")) {
				if (password.equals("1234")) {
					System.out.println("환영합니다");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다");
				
			}

		}

	}

}
