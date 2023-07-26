package sec07.exam25;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		// Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어 있는지 
		// "그만"을 입력할 때까지 반복하는 프로그램을 작성하세요.
		// String 클래스의 split() 메소드를 이용하여 작성하세요.
		
		

		Scanner s = new Scanner(System.in);
		boolean run = true;
		System.out.println("게임을 시작합니다");

		while (run) {
			System.out.print(">> ");
			String str = s.nextLine();

			if (str.equals("그만")) {
				System.out.println("종료합니다");
				run = false;
			} else {
				String[] div = str.split(" ");
				System.out.println("어절 개수는 " + div.length);
			}
		}
	}

}
