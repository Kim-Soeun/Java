package sec02;

import java.util.Scanner;

public class ���տ����� {

	public static void main(String[] args) {

//		���ڸ� �Է��ϼ���
//		�����ڸ� �Է��ϼ���
//		��) ���� 5, ������ -   �Է������� ���տ����ڸ� �̿��Ͽ�
//		100���� 5�� �� num1�� ����� ��� num -=5
		
		
		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String str = s.next();

		if (str.equals("+")) { num1 += a; } 
		if (str.equals("-")) { num1 -= a; } 
		if (str.equals("*")) { num1 *= a; } 
		if (str.equals("/")) { num1 /= a; } 
		if (str.equals("%")) { num1 %= a; } 
		System.out.println("������� : " + num1);
	}	
}