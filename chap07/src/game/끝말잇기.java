package game;

import java.util.Scanner;

public class 끝말잇기 {

	public void method() {
		Scanner s = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다");
		System.out.println("게임에 참가하는 인원을 입력하세요");
		int playerNum = s.nextInt();
		String[] players = new String[playerNum];
		String[] word = new String[playerNum];
		boolean run = true;

		for (int i = 0; i < playerNum; i++) {
			System.out.println("참가자의 이름을 입력하세요");
			players[i] = s.next();
		}

		System.out.println("시작하는 단어는 아버지입니다");

		a : while (run) {

			for (int i = 0; i < playerNum; i++) {
				System.out.print(players[i] + ">> ");
				word[i] = s.next();
			}

			for (int j = 0; j < playerNum; j++) {
				if ((word[0].substring(word[0].length() - 1).equals("지"))) {
					if (word[j].substring(word[j].length() - 1).equals(word[j + 1].substring(0))) {

					} else {
						System.out.println(players[j] + "(이)가 졌습니다");
						break a;
					}

				} else {
					System.out.println(players[0] + "(이)가 졌습니다");
					break a;
				}

			}

		}
	}
}
