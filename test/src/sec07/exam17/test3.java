package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� 10���� �Է��ϼ��� : ");
		int[] numbers = new int[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = s.nextInt();
		}

		for (int J = 0; J < 10; J++) {
			if(numbers[J]%2==0) {
				System.out.println("¦���� : " + numbers[J] );
			}
		}
	}

}
