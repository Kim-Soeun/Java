package sec07.exam25;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		// Scanner�� �̿��Ͽ� �� ������ �а�, �������� �и��� ������ �� �� ��� �ִ��� 
		// "�׸�"�� �Է��� ������ �ݺ��ϴ� ���α׷��� �ۼ��ϼ���.
		// String Ŭ������ split() �޼ҵ带 �̿��Ͽ� �ۼ��ϼ���.
		
		

		Scanner s = new Scanner(System.in);
		boolean run = true;
		System.out.println("������ �����մϴ�");

		while (run) {
			System.out.print(">> ");
			String str = s.nextLine();

			if (str.equals("�׸�")) {
				System.out.println("�����մϴ�");
				run = false;
			} else {
				String[] div = str.split(" ");
				System.out.println("���� ������ " + div.length);
			}
		}
	}

}