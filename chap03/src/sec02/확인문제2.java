package sec02;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

//		129p Ȯ�ι��� 9��
		
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° �� : ");
		double num1 = Double.parseDouble(s.next());
		
		System.out.println("�ι�° �� : ");
		double num2 = Double.parseDouble(s.next());
		
		double result = num1 / num2;
		String result2 = (num2 == 0) ? "���Ѵ�" : String.valueOf(result); // String.valueof() : ���� -> ���ڿ�
		System.out.println("��� : " + result2);
		
	}	

}
