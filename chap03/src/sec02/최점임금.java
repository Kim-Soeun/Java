package sec02;

import java.util.Scanner;

public class �����ӱ� {

	public static void main(String[] args) {

//		���� �����ڸ� ����ϼ���
//		(����) ? ��1 : ��2
//		����ڷκ��� �ٷνð��� �Է¹�������
//		1�ð��� 9620�� �Դϴ�
//		���� �ٷνð��� 10�ð� �̻��̸�
//		�ӱ��� 1.2�踦 �޽��ϴ�
//		�� �ӱ��� ����ϼ���(int�� ���)
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ٷνð��� �Է��ϼ���");
		int time = s.nextInt();	
		int a = time*9620;
		
//		double result = (time>=10) ? a*1.2  : a;
//		System.out.println((int)result);
		
		int result = (int) ((time>=10) ? a*1.2  : a);
		System.out.println(result);
	
	}

}
