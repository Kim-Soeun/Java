package sec02;

import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		
//		�����ϴ� ������ �Է����� �� 
//		�� 1, ���� 2, ���� 3, �ܿ� 4
//		�ٸ� ���ڸ� �Է��ϸ� �ٽ� �Է��ϵ��� �ݺ�
//		�迭 ����ϱ�

		Scanner s = new Scanner(System.in);

		String[] weather = new String[4];
		weather[0] = "��";
		weather[1] = "����";
		weather[2] = "����";
		weather[3] = "�ܿ�";

		boolean run = true;
		while (run) {
			System.out.println("�����ϴ� ������ �Է��ϼ���");
			System.out.println("���� 1, ���� 2, ���� 3, �ܿ� 4");

			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0] + "�� �����ϼ̽��ϴ�");
				run = false;
				break;
			case 2:
				System.out.println(weather[1] + "�� �����ϼ̽��ϴ�");
				run = false;
				break;
			case 3:
				System.out.println(weather[2] + "�� �����ϼ̽��ϴ�");
				run = false;
				break;
			case 4:
				System.out.println(weather[3] + "�� �����ϼ̽��ϴ�");
				run = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}

		}

	}

}
