package sec01;

import java.util.Scanner;

public class ���ǹ�2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���");
		String code = s.next();
		char part = code.charAt(0);
		String position = code.substring(1,3);
		
		
		// �����ڵ�� A����1234, B����4567, C����9874
		// A �λ�� B ��ȹ�� C �ѹ���
		// ���ʽ� �ݾ� : ���� 100����, ���� 70����, ���� 50����
		// ��) A����1234 -> �λ�� ����� ���ʽ� �ݾ��� 100���� �Դϴ�.
		// ���ڿ� Ư�� �κ� ���� -> substring
		
		switch (part) {
		case 'A' :
		case 'a' :
			System.out.print("�λ�� ");
			break;
		case 'B' :
		case 'b' :
			System.out.print("��ȹ�� ");
			break;
		default :
			System.out.print("�ѹ��� ");
			break;
		}
		
		switch (position) {
		case "����" :
			System.out.printf("%s�� ���ʽ� �ݾ��� 100���� �Դϴ�.", position);
			break;
		case "����" :
			System.out.printf("%s�� ���ʽ� �ݾ��� 70���� �Դϴ�.", position);
			break;
		default :
			System.out.printf("%s�� ���ʽ� �ݾ��� 50���� �Դϴ�.", position);
		}
			
	}

}
