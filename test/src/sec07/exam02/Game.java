package sec07.exam02;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		boolean run = true;
		
			
		while (run) {

			System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���");
			System.out.println("�׸��� �Է��ϸ� ������ ����˴ϴ�");

			String myChoice = s.next();
			int comNum = (int) (Math.random() * 3);
			String[] choice = { "����", "����", "��" };

			if (myChoice.equals("�׸�")) {
				System.out.println("������ �����մϴ�");
				run = false;
			} else {
				System.out.println("��� : " + myChoice);
				System.out.println("��ǻ�� : " + choice[comNum]);

				if (myChoice.equals(choice[comNum])) {
					System.out.println("�����ϴ�");
				} else if (myChoice.equals("����")) {
					if (comNum == 1) {
						System.out.println("����� �����ϴ�");
					} else {
						System.out.println("����� �̰���ϴ�");
					}
				} else if (myChoice.equals("����")) {
					if (comNum == 0) {
						System.out.println("����� �̰���ϴ�");
					} else {
						System.out.println("����� �����ϴ�");
					}
				} else if (myChoice.equals("��")) {
					if (comNum == 0) {
						System.out.println("����� �����ϴ�");
					} else {
						System.out.println("����� �̰���ϴ�");
					}
				}
			}		System.out.println("--------------");

		}

	}
}
