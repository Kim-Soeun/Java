package sec02;

import java.util.Scanner;

public class �迭8 {

	public static void main(String[] args) {

//		�迭�� ������?
//		scanner ���� �Է� ����
//		�Է¹��� ������ŭ �ݺ������� ���ڸ� �Է��ϼ���
//		�ش� ���ڵ��� �հ�� ����� ����ϼ���

		Scanner s = new Scanner(System.in);
		System.out.println("�迭�� ������?");
		int arraynum = s.nextInt();
		int[] num = new int[arraynum]; // �Է¹��� ���ڷ� �迭 ����
		int sum = 0;
		
		
		for(int j=0; j<arraynum; j++) {
			System.out.println((j+1) + "��° ���ڸ� �Է��ϼ���");
			num[j] = s.nextInt();
//			int num2 = s.nextInt();
//			num[j] = num2;
		}
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / arraynum;
		System.out.println("��� : " + avg);
	}

}
