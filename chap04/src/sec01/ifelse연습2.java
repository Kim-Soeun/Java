package sec01;

import java.util.Scanner;

public class ifelse����2 {

	public static void main(String[] args) {

//		int Ÿ�� ���� 3�� ����
//		�ϳ��� 6�����̸� ���հ�
//		3�� ���ؼ� 30�̻��̸� �հ�

		Scanner s = new Scanner(System.in);
		System.out.println("���� : ");
		int num1 = s.nextInt();
		System.out.println("���� : ");
		int num2 = s.nextInt();
		System.out.println("���� : ");
		int num3 = s.nextInt();
		int sum = num1 + num2 + num3;

		if (num1 <= 6 || num2 <= 6 || num3 <= 6 || sum<30) {
			System.out.println("���հ��Դϴ�!");
		} else {
			System.out.println("�հ��Դϴ�!");
		}
	}

}
