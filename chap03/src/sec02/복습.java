package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

//		���� �����ڸ� ����ϼ���
//		(����) ? ��1 : ��2
//		����ڷκ��� �ٷνð��� �Է¹�������
//		1�ð��� 9620�� �Դϴ�
//		���� �ٷνð��� 10�ð� �̻��̸�
//		�ӱ��� 1.2�踦 �޽��ϴ�
//		�� �ӱ��� ����ϼ���(int�� ���)
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ٷνð�");
		int time = s.nextInt();
		double money = time * 9620;
		
		double result = (time>=10) ? money : money*1.2;
		System.out.println("�� �ӱ� : " + (int)result);
		}
	}
