package test;

import java.util.Scanner;

public class Ȯ�ι���1 {

	public static void main(String[] args) {

//			98p
//		1������ : Scanner Ȱ��
//		����� �̸���? �̸� �Է� �ޱ�   	 string
//		����� ���̴�?                	int
//		����� �޴��� ��ȣ ��� 4�ڸ���?  string
//		����� �޴��� ��ȣ �� 4�ڸ���? 	string
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("����� ���̴�?");
		int age = s.nextInt();
		System.out.println("����� �޴��� ��ȣ ��� 4�ڸ���?");
		String phone = s.next();
		System.out.println("����� �޴��� ��ȣ �� 4�ڸ���?");
		String phone2 = s.next();
		
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age + "\n");
		System.out.printf("��ȭ : 010 - %s - %s",phone, phone2);
		
	}

}
