package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		// ����ڰ� �Է��� ���ڷ� �迭 ���� ����
		// for ���� �̿��Ͽ� �迭�� ���ڸ� 1���� ����ڰ� �Է��� ���ڸ�ŭ ������ �߰�
		// �Էµ� �������� ��հ� ���
		
		Scanner s = new Scanner (System.in);
		System.out.println("�迭 ������ �Է����ּ���");
		int arraynum = s.nextInt();
		int[] num = new int[arraynum];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<arraynum; i++) {
			num[i] = i+1;
			sum += num[i];
			avg = (double) sum / arraynum;
		}	System.out.println("��� : " + avg);
		
	
	}

}