package sec02;

import java.util.Scanner;

public class for������5 {

	public static void main(String[] args) {

//	100 ������ �ٸ� ���� 2���� �Է� �޾� Ȧ���� ���� ���� ������ ū ������ ����ϴ� ���α׷��� �ۼ��غ�����(for�� ���)
//		�����Է�1 : 20,   �����Է�2 : 30  ->  21 23 25 27 29 
//		�����Է�1 : 30,   �����Է�2 : 20  ->  21 23 25 27 29

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� 1 : ");
		int a = s.nextInt();
		System.out.print("���� �Է� 2 : ");
		int b = s.nextInt();
		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
