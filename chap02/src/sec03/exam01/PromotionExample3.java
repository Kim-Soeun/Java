package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		
//		출신학교를 입력하세요.
//		사용자가 입력한 글자의 유니코드를 출력합니다.
//		예) 입력하신 '사'의 유니코드는 49324 입니다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("출신학교를 입력하세요.");
		String a = s.next();
		char b = a.charAt(2);
		
		System.out.println("현재 몇학년 인가요?");
		int c = s.nextInt();
		
		if(b=='중') {
			System.out.print("당신은 중학생 ");
		} else {
		System.out.print("당신은 고등학생 ");
		}
		
		
		
		System.out.println(c + "학년 입니다.");
		
		
	}

}
