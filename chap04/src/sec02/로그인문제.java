package sec02;

import java.util.Scanner;

public class �α��ι��� {

	public static void main(String[] args) {

//		���̵� : abc  ��й�ȣ : 1234
//		����ڷκ��� ���̵�� ��й�ȣ�� �Է¹�������
//		���̵�� ������ ��й�ȣ�� �ٸ��� "��й�ȣ�� �޶��"
//		���̵� �������� ������ "���̵� �������� �ʽ��ϴ�"
//		�α����� �ɶ����� ���� �ݺ�
//		���̵�, ��й�ȣ ��� ������ "ȯ���մϴ�" ����� ����

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("���̵� : ");
			String user_id = s.next();
			System.out.print("��й�ȣ : ");
			String password = s.next();

			if (user_id.equals("abc")) {
				if (password.equals("1234")) {
					System.out.println("ȯ���մϴ�");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�");
				}
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�");
				
			}

		}

	}

}
