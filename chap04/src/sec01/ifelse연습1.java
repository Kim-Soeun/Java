package sec01;

import java.util.Scanner;

public class ifelse����1 {

	public static void main(String[] args) {

//		num�� Ȧ������ ¦������ �Ǻ��Ͽ� �Ʒ��� ���� ���� ����� �������� ���α׷��� ��������
//		��) ������ �Է��ϼ���: 42"
//		"42�� ¦���Դϴ�
//		��) ������ �Է��ϼ���: 71"
//		"71�� Ȧ���Դϴ�

		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num = s.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "�� ¦���Դϴ�");
		} else {
			System.out.println(num + "�� Ȧ���Դϴ�");
		}
	}

}
