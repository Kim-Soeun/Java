package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = s.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}	System.out.println(" ");
		}
	}

}
