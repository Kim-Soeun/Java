package sec02;

import java.util.Scanner;

public class �н��ڵ� {

	public static void main(String[] args) {

//		�н��ڵ带 �Է��ϼ���
//		�н��ڵ�� 20M456, 22K123, 23E447
//		�� 2�� ���ڴ� ��û�⵵
//		����° ���ڴ� ������ ��Ÿ���ϴ�
//		M ����, K ����, E�� ����
//		��) 22K123 -> 2022�⵵ ������� ��û���Դϴ�

		Scanner s = new Scanner(System.in);
		String code = s.next();
		String year = code.substring(0, 2);
		char subject = code.charAt(2);

		switch (subject) {
		case 'M':
		case 'm':
			System.out.println("20" + year + "�⵵ ���а��� ��û���Դϴ�");
			break;
		case 'K':
		case 'k':
			System.out.println("20" + year + "�⵵ ������� ��û���Դϴ�");
			break;
		default:
			System.out.println("20" + year + "�⵵ ������� ��û���Դϴ�");
			break;
		}

	}

}
