package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�迭���� : ");
		int arraynum = s.nextInt();
		int sum = 0;
		double avg;
		
		int num[] = new int [arraynum];
		
		for(int i=0; i<arraynum; i++) {
			num[i] = i+1;
			sum += num[i];
		}	avg = (double) sum/arraynum;
			System.out.println("��� : " +  avg);
		
		
	}
}
