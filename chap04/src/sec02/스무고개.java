package sec02;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {

		
//		1~20 ���� �Է�
//		1~20 ���� ���� ����
//		����� ����=��ǻ�� ����  : "�����Դϴ�"
//		������ ���� ��Ʈ �ְ� �ٽ� �Է�
		
		Scanner s = new Scanner(System.in);

		// �������� ���� ���� (1~20)
		int comNum = (int) (Math.random() * 20) + 1;
		

		while (true) {
			System.out.println("���� �ϳ��� �Է��ϼ���(1~20)");
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("�����Դϴ�");
				break;
			} else if (userNum > comNum) {
				System.out.println("����� ���ڴ� ��ǻ�� ���ں��� Ů�ϴ�");
			} else {
				System.out.println("����� ���ڴ� ��ǻ�� ���ں��� �۽��ϴ�");
			}
		}

	}

}
