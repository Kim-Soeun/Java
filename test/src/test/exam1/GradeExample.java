package test.exam1;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math, science, english);
		// �ʵ� 3��, ������ 1��, �޼ҵ� 4��

		System.out.println("����� " + me.average());
		// average�� ����� ����Ͽ� ����

	}

}