package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {

//		int Ÿ���� ���� num1�� �ʱⰪ���� 1~6 �߿��� �ϳ��� ���� �������� �̴´�.
//		int Ÿ���� ���� num2 1~6 ���� ���ڸ� �Է��ϼ���
// 	 	�� ���� ��ġ�ϸ� "�� ���� ��ġ�մϴ�"
//		��ǻ�� ���ڰ� �� ũ�� "��ǻ�� ���ڰ� �� Ů�ϴ�"
//		����� ���ڰ� �� ũ�� "����� ���ڰ� �� Ů�ϴ�"

		int num1 = (int) (Math.random() * 6) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(1~6)");
		int num2 = s.nextInt();

		System.out.println("��ǻ�� �� : " + num1);
		System.out.println("����� �� : " + num2);
		if (num1 == num2) {
				System.out.println("�� ���� ��ġ�մϴ�");
		} else if (num1 > num2) {
			System.out.println("��ǻ�� ���ڰ� �� Ů�ϴ�");
		} else {
			System.out.println("����� ���ڰ� �� Ů�ϴ�");
		}

	}

}
