package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

//		1~20 ���� �Է�
//		1~20 ���� ���� ����
//		����� ����=��ǻ�� ����  : "�����Դϴ�"
//		������ ���� ��Ʈ �ְ� �ٽ� �Է�

		Scanner s = new Scanner(System.in);
		
		int b = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.println("����� ���� : ");
			int a = s.nextInt();
			if (a == b) {
				System.out.println("����");
				break;
			} else if (a > b) {
				System.out.println("����� ���ڰ� �� ŭ");
			} else {
				System.out.println("����� ���ڰ� �� ����");
			}
		}

	}

}
