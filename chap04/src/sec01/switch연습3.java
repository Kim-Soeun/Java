package sec01;

import java.util.Scanner;

public class switch����3 {

	public static void main(String[] args) {

//		�����ȣ�� �Է¹޽��ϴ�
//		�����ȣ�� ���� 6�ڸ��� ����빮�� �����Դϴ� ��)123456A
//		�����ȣ ���ڸ��� A�̸� "������Ұ� 201ȣ�Դϴ�"
//		�����ȣ ���ڸ��� B�̸� "������Ұ� 202ȣ�Դϴ�"
//		�����ȣ ���ڸ��� C�̸� "������Ұ� 203ȣ�Դϴ�"
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("�����ȣ : " );
		String num = s.next();
		char a = num.charAt(6);

		switch (a) {
		case 'A':
			System.out.println("������Ұ� 201ȣ �Դϴ�");
			break;
		case 'B':
			System.out.println("������Ұ� 202ȣ�Դϴ�");
			break;
		default:
			System.out.println("������Ұ� 203ȣ�Դϴ�");
			break;
		}
	}
}
