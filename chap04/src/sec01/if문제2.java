package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {

//		num�� 3�� ������ "3�� ����Դϴ�"
		Scanner s = new Scanner(System.in);
		System.out.println("�����Է� : ");
		int num = s.nextInt();

		if (num % 3 == 0 && num != 0) {
//			num!=0 �� 0�� ���ڷ� �Է����� ���� ����� �����ִ� ����
			System.out.println("3�� ����Դϴ�.");
		}	else {
			System.out.println("3�� ����� �ƴմϴ�");
		}

	}

}
