package sec02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

//		삼항 연산자를 사용하세요
//		(조건) ? 값1 : 값2
//		사용자로부터 근로시간을 입력받으세요
//		1시간당 9620원 입니다
//		만약 근로시간이 10시간 이상이면
//		임금의 1.2배를 받습니다
//		총 임금을 출력하세요(int로 출력)
		
		Scanner s = new Scanner(System.in);
		System.out.println("근로시간");
		int time = s.nextInt();
		double money = time * 9620;
		
		double result = (time>=10) ? money : money*1.2;
		System.out.println("총 임금 : " + (int)result);
		}
	}
