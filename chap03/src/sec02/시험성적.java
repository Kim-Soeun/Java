package sec02;

import java.util.Scanner;

public class ���輺�� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("���� ��й�ȣ�� �Է��� �ּ���");
		String pw= s.next();
		char pw1 = pw.charAt(0);
		char pw2 = pw.charAt(1);
		
		if ((pw1>=97) && (pw1<=122) && !(pw2<48) && !(pw2>57)) {
			System.out.println(name + "�� ȯ���մϴ�");
		}	else {
			System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�");
			
		}
		
		
		// ��й�ȣ�� ���� �ҹ��ڿ� ������ ���� ��) a5, b7
		//����ڰ� ��й�ȣ�� �ǰ� �Է��ϸ� "ȯ���մϴ�"
		//����ڰ� ��й�ȣ�� Ʋ���� �Է��ϸ� "��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�"
		
		
		
	}

}
