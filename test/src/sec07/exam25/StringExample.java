package sec07.exam25;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		// 문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하세요.

		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 가능합니다");
		String str = s.nextLine();
		
		for(int i=1; i<=str.length(); i++) {
			char first = str.charAt(0);
			str = str.substring(1) + first;
			System.out.println(str);
		}
		
	}

}
