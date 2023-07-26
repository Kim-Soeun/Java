package sec07.exam25;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

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
