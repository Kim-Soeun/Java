package sec02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

		// 사용자가 입력한 숫자로 배열 개수 생성
		// for 문을 이용하여 배열에 숫자를 1부터 사용자가 입력한 숫자만큼 데이터 추가
		// 입력된 데이터의 평균값 출력
		
		Scanner s = new Scanner (System.in);
		System.out.println("배열 개수를 입력해주세요");
		int arraynum = s.nextInt();
		int[] num = new int[arraynum];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<arraynum; i++) {
			num[i] = i+1;
			sum += num[i];
			avg = (double) sum / arraynum;
		}	System.out.println("평균 : " + avg);
		
	
	}

}