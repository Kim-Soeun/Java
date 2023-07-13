package sec07.exam02;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean run = true;
		
			
		while (run) {

			System.out.println("가위, 바위, 보 중 하나를 입력하세요");
			System.out.println("그만을 입력하면 게임이 종료됩니다");

			String myChoice = s.next();
			int comNum = (int) (Math.random() * 3);
			String[] choice = { "가위", "바위", "보" };

			if (myChoice.equals("그만")) {
				System.out.println("게임을 종료합니다");
				run = false;
			} else {
				System.out.println("당신 : " + myChoice);
				System.out.println("컴퓨터 : " + choice[comNum]);

				if (myChoice.equals(choice[comNum])) {
					System.out.println("비겼습니다");
				} else if (myChoice.equals("가위")) {
					if (comNum == 1) {
						System.out.println("당신이 졌습니다");
					} else {
						System.out.println("당신이 이겼습니다");
					}
				} else if (myChoice.equals("바위")) {
					if (comNum == 0) {
						System.out.println("당신이 이겼습니다");
					} else {
						System.out.println("당신이 졌습니다");
					}
				} else if (myChoice.equals("보")) {
					if (comNum == 0) {
						System.out.println("당신이 졌습니다");
					} else {
						System.out.println("당신이 이겼습니다");
					}
				}
			}		System.out.println("--------------");

		}

	}
}
