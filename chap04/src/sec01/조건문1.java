package sec01;

import java.util.Scanner;

public class ���ǹ�1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("����� �ڵ带 �Է��� �ּ���");
		// ��) A115, B113, d119
		// ����� �ڵ忡�� �� �� ���� �� ���ڸ� �̾ƿ�����
		// ��� a��� " �λ�ο� �����Ǽ̽��ϴ�"
		// ��� b��� " ��ȹ�ο� �����Ǽ̽��ϴ�"
		// ��� c��� " �ѹ��ο� �����Ǽ̽��ϴ�"

		String code = s.next();
		char a = code.charAt(0);

		switch (a) {
			case 'A':
			case 'a':
				System.out.println("�λ�ο� �����Ǽ̽��ϴ�");
				break;
			case 'B':
			case 'b':
				System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�");
				break;
			default:
				System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�");
				break;
		}

	}

}
