package sec02;

import java.util.Scanner;

public class Ȯ�ι���6 {

	public static void main(String[] args) {
// 	202p

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner s = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5. ����");
			System.out.println("------------------------");
			System.out.print("����> ");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				// �Է¹��� ���ڸ�ŭ�� �迭 ����

				System.out.print("�л���> ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
			}

			else if (selectNo == 2) {
				// �� �迭�� ���� �Է�
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = s.nextInt();
				}
			} else if (selectNo == 3) {
				// �� �迭�� ���� ���
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				// �迭���� �ְ� ������ ������� ���
				int max = 0;
				int sum = 0;
				double avg;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("�ְ����� : " + max);
				avg = (double) sum / studentNum;
				System.out.println("������� : " + avg);

			}

		}
	}
}
