package sec02;

import java.util.Scanner;

public class �����ڵ� {

	public static void main(String[] args) {

		// �����ڵ带 �Է��ϼ���

		Scanner s = new Scanner(System.in);
		System.out.println("�����ڵ带 �Է��ϼ���");
		String code = s.next();
		String user_name = code.substring(0, 3);
		String num = code.substring(3);

		System.out.println("���̵�: " );
		String name = s.nextLine();
		System.out.println("�н�����: " );
		String pw = s.nextLine();

		if (user_name.equals(name)) {
			if (num.equals(pw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : �н����� �������� ����");
			}
		} else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}
	}
}
