package sec02;

import java.util.Scanner;

public class ���ʰ��� {

	public static void main(String[] args) {

//		�л��� �Է� ��������
//		���� ���� �Է� ��������
		
//		�л��鿡�� ������ �����ְ� �;��
//		�л��� 10���̰� ���ʼ� 33���̸�
//		�Ѹ�� 3���� 3���� ���ƿ�
		
//		(��¹�) �л� �� ��� ~���� ������ �������� ~���� ���ƿ�
		
		Scanner s = new Scanner(System.in);
		System.out.println("�л����� �Է��ϼ���");
		int student = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int pencil = s.nextInt();
		
		int result = pencil / student;
		int result2 = pencil % student;
		
		System.out.printf("�л� �� ��� %d���� ������ �������� %d���� ���ƿ�\n", result, result2);
//		System.out.println("�л� �� ��� " + result + "���� ������ �������� " + result2 + "���� ���ƿ�");
	}

}
