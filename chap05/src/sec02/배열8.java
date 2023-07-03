package sec02;

import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {

//		배열의 개수는?
//		scanner 통해 입력 받음
//		입력받은 개수만큼 반복문으로 숫자를 입력하세요
//		해당 숫자들의 합계와 평균을 출력하세요

		Scanner s = new Scanner(System.in);
		System.out.println("배열의 개수는?");
		int arraynum = s.nextInt();
		int[] num = new int[arraynum]; // 입력받은 숫자로 배열 생성
		int sum = 0;
		
		
		for(int j=0; j<arraynum; j++) {
			System.out.println((j+1) + "번째 숫자를 입력하세요");
			num[j] = s.nextInt();
//			int num2 = s.nextInt();
//			num[j] = num2;
		}
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / arraynum;
		System.out.println("평균 : " + avg);
	}

}
