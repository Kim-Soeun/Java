package sec03.exam03;

import java.util.Scanner;

public class �Ǽ�Ÿ�Ժ�ȯ���� {

	public static void main(String[] args) {
		//�߰���� ������ �Է��ϼ���(50�� ����)
		// ��) 34.8
		// �⸻��� ������ �Է��ϼ���(50�� ����)
		// ��) 24.7
		//���� ������ 59.5 �Դϴ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�߰���� ������ �Է��ϼ���(50�� ����)");
		double a = s.nextDouble();
		
		System.out.println("�⸻��� ������ �Է��ϼ���(50�� ����)");
		double b = s.nextDouble();
		
		double c = a + b;
		
		System.out.println("���� ������ " + c + "�Դϴ�.");
	}

}
