package test;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

//		99p 3�� ����
		
		Scanner s = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: " );
		String name = s.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: " );
		String num = s.next();
		System.out.print("3. ��ȭ��ȣ : " );
		String phone = s.next();
		
//		System.out.printf("%s�� �ֹι�ȣ�� %s�̰� ����ó�� %s�Դϴ�\n",name, num, phone);
		System.out.printf("\n[�Է��� ����]\n%s\n%s\n%s",name, num, phone);
		
	}

}
