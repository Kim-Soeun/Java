package sec03.exam03;

import java.util.Scanner;

public class �Ǽ�Ÿ�Ժ�ȯ����2 {

	public static void main(String[] args) {
		//ù��° ���� �Է��ϼ���
		// ��) 5
		// �ι�° ���� �Է��ϼ���
		// ��) 2
		//�Է��Ͻ� �� ���� ������ �����  2.5�Դϴ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ���");
		int a = s.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ���");
		int b = s.nextInt();
		
		double c = (double)a / (double)b; //double c = (double) a / b; �̷��Ե� ����
		
		System.out.println("�Է��Ͻ� �� ���� ������ ����� " + c + "�Դϴ�.");
		
	}

}
