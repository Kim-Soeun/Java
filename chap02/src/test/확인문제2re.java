package test;

import java.util.Scanner;

public class Ȯ�ι���2re {

	public static void main(String[] args) {

//		�� ���� �Է¹޴´�
//		ù ��° ���� �� ��° ������ ũ�� ���� ����
//		ù ��° ���� �� ��° ������ ������ ���� ����
//		��) 5,3  5-3=2        3,5  3+5 = 8
//		���� ��� : 2    		  ���� ��� : 8
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° �� :");
		String strNum1 = s.next();
		System.out.print("�� ��° �� :");
		String strNum2 = s.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result; 					// result�� ������ �̸� �����صθ� if�ȿ��� ��� �����
		if(num1>num2) {
			result = num1 - num2;                  
			System.out.println("���� ��� :" + result);
		} else {
			result = num1 + num2;                   // result2�� ���� �ʿ� x, if�� �� �߿� �ϳ��� ����� �����ϱ�
			System.out.println("���� ��� :" + result);
			
		}
	}

}
