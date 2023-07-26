package sec07.exam25;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

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
