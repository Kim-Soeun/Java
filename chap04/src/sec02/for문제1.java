package sec02;

import java.util.Scanner;

public class for����1 {

	public static void main(String[] args) {

//	30 ������ �ٸ� ���� 2���� �Է� �� �� ������ �� ���� ����ϴ� ���α׷��� �ۼ��غ�����(for��)
//		��) �����Է�1 : 5
//			�����Է�2 : 9
//			5+6+7+8+9 = 35

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int a = s.nextInt();
		System.out.print("���� �Է�2 : ");
		int b = s.nextInt();
		int large = 0;
		int small = 0;
		int sum = 0;

		if (a > b) {
			large = a;
			small = b;
		} else {
			large = b;
			small = a;
		}

		for (int i = small; i <= large; i++) {
			sum += i;
			if (i == large) {
				System.out.print(i + "=" + sum);
			} else {
				System.out.print(i + "+");
			}
		}
	}

}
