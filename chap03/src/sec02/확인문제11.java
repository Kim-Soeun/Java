package sec02;

import java.util.Scanner;

public class Ȯ�ι���11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("���̵�: ");
		String name = s.nextLine();
		System.out.print("�н�����: ");
		String pw = s.nextLine();
		int password = Integer.parseInt(pw);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}

	}

}
