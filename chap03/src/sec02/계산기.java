package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

//		���� 2���� �Է��ϼ���
//		�����ڸ� �Է��ϼ��� ( +, -, *, /)
//		��) 5,2, +  -> 7
//		��) 2,5,-  -> 3
//		��) 5,2,*  -> 10
//		��) 5,2,/  ->2.5

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���( +, -, *, /)");
		String str = s.next();

		int temp;
		int result;
		double result2;

		if (num2 > num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (str.equals("+")) {
			result = num1 + num2;
			System.out.println(result);
		}
		if (str.equals("-")) {
			result = num1 - num2;
			System.out.println(result);
		}
		if (str.equals("*")) {
			result = num1 * num2;
			System.out.println(result);
		}
		if (str.equals("/")) {
			result2 = num1 / num2;
			System.out.println(result2);
		}

	}
}
