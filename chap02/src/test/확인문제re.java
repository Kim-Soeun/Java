package test;

import java.util.Scanner;

public class 확인문제re {

	public static void main(String[] args) {

//			98p 응용문제
//		1번문제 : Scanner 활용
//		당신의 이름은?
//		중간고사 점수? 점수 입력 받기   	 double
//		기말고사 점수?                	double
//		리포트 점수는?  				double
		
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("중간고사 점수?");  // 예) 83.67
		double mid = s.nextDouble();
		System.out.println("기말고사 점수?");
		double last = s.nextDouble();
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();
		
//		printf 사용   홍길동님의 평균 점수는 : 73.25 입니다
		
		double average = (mid + last + report) / 3;
		System.out.printf("%s님의 평균 점수는 %5.2f 입니다", name, average);
		
	}

}
