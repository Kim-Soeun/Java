package sec03.exam07;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

//		�� ���� �Է� �޽��ϴ�.
//		��, next()�̿��Ͽ� ���ڿ��� �Է¹���
//		�Է¹��� ���ڿ��� parseInt �̿��Ͽ� ���ڷ� ����ȯ ��Ű����
//		��) �� ���� �հ�� : 66�Դϴ�.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		String str = s.next();
		int b = Integer.parseInt(str);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		String str2 = s.next();
		int c = Integer.parseInt(str2);
		
		int d = b + c;
		System.out.println("�� ���� �հ�� : " + d + "�Դϴ�.");
		
	}

}
