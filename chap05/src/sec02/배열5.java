package sec02;

import java.util.Scanner;

public class �迭5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �˷��ּ���");
		int arraynum = s.nextInt();
		int sum = 0;
		double avg=0;
		
		int[] num1 = new int[arraynum];   // ����ڰ� �Է��� ���ڷ� �迭 ���� ����
		
		// for ���� �̿��Ͽ� �迭�� ���ڸ� 1���� ����ڰ� �Է��� ���ڸ�ŭ ������ �߰�
		
		// �Էµ� �������� ��հ� ���
		
		for(int i=0; i<arraynum; i++) {
			num1[i] = i+1;
			sum += num1[i]; 
			avg = (double) sum/arraynum;
		}	System.out.println("��հ� : " + avg);
		
		
	}

}
