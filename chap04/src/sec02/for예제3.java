package sec02;

import java.util.Scanner;

public class for����3 {

	public static void main(String[] args) {

//	 ����ڷκ��� ���ڸ� �Է� ��������(1~100 ����)
//   int 1���� ����ڰ� �Է��� ���ڱ����� �հ踦 ���ϼ���
//	 for�� Ȱ��
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1���� " + num + "������ �հ�� : " + sum + "�Դϴ�");
	}

}
