package sec01;

import java.util.Scanner;

public class SubStringExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸����� �Է��� �ּ���");
		String email = s.next();

		// ��) �̸��� : 12dk545@hanmail.net   -> ���̵� ������ ������
		
		int location = email.indexOf("@");
		// ���̵� �����ϱ�
		String id = email.substring(0, location);
		System.out.println("���̵� : " + id);

		// ������ �����ϱ�
		String domain = email.substring(location);
		System.out.println("������ : " + domain);
		
	}

}
