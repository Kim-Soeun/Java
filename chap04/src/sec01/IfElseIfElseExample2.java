package sec01;

import java.util.Scanner;

public class IfElseIfElseExample2 {

	public static void main(String[] args) {

//		�߰���� ����, �⸻��� ���� ��������� 90�� �̻��̸� "A"����
//		�߰���� ����, �⸻��� ���� ��������� 80�� �̻��̸� "B"����
//		�������� "C"�����̵� ��� �� �����̶� 60�� �̸��̸� "�����"

		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();
		int average = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("�����");
		} else if (average >= 90) {
			System.out.println("A����");
		} else if (average >= 80) {
			System.out.println("B����");
		} else {
			System.out.println("C����");
		}

	}

}
