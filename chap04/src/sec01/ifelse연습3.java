package sec01;

import java.util.Scanner;

public class ifelse����3 {

	public static void main(String[] args) {

// 	7000��¥�� ���ἱ����Ʈ �������� �� �����ؾ� �ϴ� �ݾ� ��� ���α׷� �����
//	��, 8�� �̻� ���� �ÿ��� 10% ����	

		Scanner s = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int num = s.nextInt();
		int result = num * 7000;
		
		if (num<8) {
			System.out.println("������ " + result + "�� �Դϴ�.");
		}	else {
//			result -= result/10;   �̷� �ĵ� ����
			result = num*6300;
			System.out.println("������ " + result + "�� �Դϴ�");
		}

		
	}

}
