package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

//		���ڸ� �Է��ϼ���
//		�����ڸ� �Է��ϼ���
//		��) ���� 5, ������ -   �Է������� ���տ����ڸ� �̿��Ͽ�
//		100���� 5�� �� num1�� ����� ��� num -=5
		
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String b = s.next();
		int num =100;
		
		if (b.equals("-")) { num -=a; }
		if (b.equals("+")) { num +=a; }
		if (b.equals("*")) { num *=a; }
		if (b.equals("/")) { num /=a; }
		
		
		
	}
}
