package sec01;

import java.util.Scanner;

public class if����3 {

	public static void main(String[] args) {

//		num�� 2�� ����̸鼭 5�� ������ "2�� 5�� ����Դϴ�."
		Scanner s = new Scanner(System.in);
		System.out.println("�����Է� : ");
		int num = s.nextInt();

		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		} else {
			System.out.println("2�� 5�� ����� �ƴմϴ�");
		}

	}

}
