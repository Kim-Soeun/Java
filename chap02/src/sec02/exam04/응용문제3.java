package sec02.exam04;

import java.util.Scanner;

public class ���빮��3 {

	public static void main(String[] args) {
		// �� ���� ���̰� 5���� �� ��, �ǹ��� �� ������ �Է¹޾� ���̿� �ִ� ���� �ο��� ����ϼ���
		// Scanner s = new Scanner(System.in);
		// ��) ����ڰ� 35�� �Է��ϸ� ���̴� 35*5=175m
		// �ִ� �����ο��� 175/3=58��
		// ��� = �Է��Ͻ� �ǹ��� ��ü 175m�̰� �ִ�����ο��� 58���Դϴ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ǹ��� �����ΰ���?");
		
		int a = s.nextInt();
		int b = a * 5;
		int c = b / 3;
		
		System.out.println("�Է��Ͻ� �ǹ��� ��ü " + b + "m�̰� �ִ�����ο��� " + c + "���Դϴ�");
		
		
	}

}
