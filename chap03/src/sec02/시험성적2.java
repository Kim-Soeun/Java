package sec02;

import java.util.Scanner;

public class ���輺��2 {

	public static void main(String[] args) {

		// �߰���簡 80�� �̻��̰ų� �⸻��簡 80�� �̻��̸� "���"
		// �ƴϸ� "Ż��"

		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������ �Է��� �ּ���");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������ �Է��� �ּ���");
		int last = s.nextInt();

		if (mid >= 80 || last >= 80) {
			System.out.println("���");
		} else {
			System.out.println("Ż��");
		}
	}
}