package sec04;

import java.util.Scanner;

public class PrintfPractice {

	public static void main(String[] args) {

//		�̸��� �Է��ϼ��� ��)�嵿��
//		���̸� �Է��ϼ��� ��)26

//	����   �̸�    ����
//	1    �嵿��	 26
		
//	���� %d ���ʸ��� �ڸ��� 3�ڸ�
//	�̸� %s
//	���� %d ������ ���� �ڸ��� 3�ڸ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String str = s.next();
		
		System.out.println("���̸� �Է��ϼ���");
		int a = s.nextInt();
		
		System.out.println("����\t�̸�\t����");
		System.out.printf("%-3d\t%s\t%3d",1 ,str, a);
		
	}
	

}
