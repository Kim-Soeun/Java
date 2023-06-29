package sec02;

import java.util.Scanner;

public class 대출권수 {

	public static void main(String[] args) {
		
//		

		Scanner s = new Scanner(System.in);
		System.out.println("광주시립도서관 방문을 환영합니다");
		
		
		int sum1 = 0;
		int sum2 = 0;
		boolean run = true;

		while (run) {
			System.out.println("직업코드와 개수를 입력해 주세요");
			String code = s.next();
			char book = code.charAt(0);
			String a = code.substring(1);
			int b = Integer.parseInt(a);
			
			
			switch (book) {
			case 'A':
			case 'a':
				sum1 += b;
				System.out.println("총 대출 권수 : " + sum1);
				break;
			case 'B':
			case 'b':
				sum2 += b;
				System.out.println("총 반납 권수 : " + sum2);
				break;
			default:
				System.out.println("종료입니다");
				run = false;
			}
		}

	}
}
