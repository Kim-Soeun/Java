package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
		
//		한 글자를 입력하세요 :
//		사용자가 입력한 글자의 유니코드를 출력합니다.
//		예) 입력하신 '사'의 유니코드는 49324 입니다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("한 글자를 입력하세요.");
		String a = s.next();
		char b = a.charAt(0); // charAt은 문자열에서 한 글자를 가져오는 기능, 0 = ???
		int c = b;
		
		System.out.println("입력하신 " + a + "의 유니코드는 " + c + "입니다.");
		
		
	}

}
