package sec02;

import java.util.Scanner;

public class Ȯ�ι��� {

	public static void main(String[] args) {

//		129p Ȯ�ι��� 9��

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° �� : ");
		String num1 = s.next();
		
		System.out.println("�ι�° �� : ");
		String num2 = s.next();
		
		double num3 = Double.parseDouble(num1);
		double num4 = Double.parseDouble(num2);
		double result = num3 / num4;
		
		String result2 = (num4 == 0) ? "���Ѵ�" : String.valueOf(result);
		System.out.println("��� : " + result2);
	}

}
