package game;

import java.util.Scanner;

public class �����ձ� {

	public void method() {
		Scanner s = new Scanner(System.in);

		System.out.println("�����ձ� ������ �����մϴ�");
		System.out.println("���ӿ� �����ϴ� �ο��� �Է��ϼ���");
		int playerNum = s.nextInt();
		String[] players = new String[playerNum];
		String[] word = new String[playerNum];
		boolean run = true;

		for (int i = 0; i < playerNum; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���");
			players[i] = s.next();
		}

		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");

		a : while (run) {

			for (int i = 0; i < playerNum; i++) {
				System.out.print(players[i] + ">> ");
				word[i] = s.next();
			}

			for (int j = 0; j < playerNum; j++) {
				if ((word[0].substring(word[0].length() - 1).equals("��"))) {
					if (word[j].substring(word[j].length() - 1).equals(word[j + 1].substring(0))) {

					} else {
						System.out.println(players[j] + "(��)�� �����ϴ�");
						break a;
					}

				} else {
					System.out.println(players[0] + "(��)�� �����ϴ�");
					break a;
				}

			}

		}
	}
}
