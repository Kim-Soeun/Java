package test;

import java.util.Scanner;

public class Ȯ�ι���2re2 {

	public static void main(String[] args) {

//		�� ���� �Է¹޴´�
//		ù ��° ���� �� ��° ���� ������   "�� ���� ���ƿ�"
//		ù ��° ���� �� ��° ���� �ٸ���   "�� ���� �޶��"

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		String strNum1 = s.next();
		System.out.print("�� ��° �� : ");
		String strNum2 = s.next();

		if (strNum1.equals(strNum2)) {
			System.out.println("�� ���� ���ƿ�");
		} else {
			System.out.println("�� ���� �޶��");
		}

	}
}
