package sec03.exam07;

import java.util.Scanner;

public class ���ڸ��⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {
		
//		�� ���� �Է� �޽��ϴ�.
//		��, next()�̿��Ͽ� ���ڿ��� �Է¹���
//		�Է¹��� ���ڿ��� parseInt �̿��Ͽ� ���ڷ� ����ȯ ��Ű����
//		��) �� ���� �հ�� : 66�Դϴ�.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String a = s.next();
		int b = Integer.parseInt(a);// Integer.parseInt = ���ڿ� -> ����(int) 
									// String.valueOf(Ÿ�԰�) = Ÿ�԰� -> ����
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		String c = s.next();
		int d = Integer.parseInt(c);
		
		int sum = b + d;
		System.out.println("�� ���� �հ�� : " + sum + "�Դϴ�.");
		
//		11�� ����
		byte value = Byte.parseByte("10");
		
	}

}
