package sec03.exam08;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
//		���� �׼��� �Է¹޾� ��������, ������, õ����, 500��¥�� ����, 100��¥�� ����, 10��¥�� ����, 1��¥�� ������ 
//		�� ��� ��ȯ�Ǵ��� ����϶�.
//		��) 53254�� �Է��ϸ�, �������� 1��, õ���� 3��, ������� 2��, ���ʿ����� 1��, �ʿ����� 4��
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �׼��� �Է��ϼ���");
		int money = s.nextInt();
		
		System.out.println("�������� " + money/50000 + "��");
		money = money % 50000;
		System.out.println("������ " + money/10000 + "��");
		money = money % 10000;
		System.out.println("õ���� " + money/1000 + "��");
		money = money % 1000;
		System.out.println("������� " + money/100 + "��");
		money = money % 100;
		System.out.println("�ʿ����� " + money/10 + "��");
		
		

	}

}
