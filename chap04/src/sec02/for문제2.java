package sec02;

import java.util.Scanner;

public class for����2 {

	public static void main(String[] args) {

//  ������ �ܼ� �Է� 
//	��) 4*1 = 4
//	��) 4*2 = 8
		

		Scanner s = new Scanner(System.in);
		System.out.println("������ �ܼ��� �Է��ϼ���");
		int num = s.nextInt();
		System.out.println("������ " + num + "��");
	

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + " = " + (num*i));
		}

	}

}
