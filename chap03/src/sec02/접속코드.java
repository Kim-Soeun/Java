package sec02;

import java.util.Scanner;

public class 접속코드 {

	public static void main(String[] args) {

		// 접속코드를 입력하세요

		Scanner s = new Scanner(System.in);
		System.out.println("접속코드를 입력하세요");
		String code = s.next();
		String user_name = code.substring(0, 3);
		String num = code.substring(3);

		System.out.println("아이디: " );
		String name = s.nextLine();
		System.out.println("패스워드: " );
		String pw = s.nextLine();

		if (user_name.equals(name)) {
			if (num.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드 존재하지 않음");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
	}
}
