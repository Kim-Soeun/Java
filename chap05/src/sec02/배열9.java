package sec02;

import java.util.Scanner;

public class �迭9 {

	public static void main(String[] args) {

//		�ζ� �� ������ �Ͻðڽ��ϱ�? (1���ӿ� 6�� ��ȣ)
//		����ڰ� �Է��� ���ڸ�ŭ �ζǹ�ȣ�� �������� ����ϼ���

		Scanner s = new Scanner(System.in);
		int[] lotto = new int[6];

		System.out.println("�ζ� �� ������ �Ͻðڽ��ϱ�?");
		int num = s.nextInt();

		for (int j = 1; j <= num; j++) {
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}

	}

}
