package sec02;

import java.util.Scanner;

public class ����Ǽ� {

	public static void main(String[] args) {
		
//		

		Scanner s = new Scanner(System.in);
		System.out.println("���ֽø������� �湮�� ȯ���մϴ�");
		
		
		int sum1 = 0;
		int sum2 = 0;
		boolean run = true;

		while (run) {
			System.out.println("�����ڵ�� ������ �Է��� �ּ���");
			String code = s.next();
			char book = code.charAt(0);
			String a = code.substring(1);
			int b = Integer.parseInt(a);
			
			
			switch (book) {
			case 'A':
			case 'a':
				sum1 += b;
				System.out.println("�� ���� �Ǽ� : " + sum1);
				break;
			case 'B':
			case 'b':
				sum2 += b;
				System.out.println("�� �ݳ� �Ǽ� : " + sum2);
				break;
			default:
				System.out.println("�����Դϴ�");
				run = false;
			}
		}

	}
}
