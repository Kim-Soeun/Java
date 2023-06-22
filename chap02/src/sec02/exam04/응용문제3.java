package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {
		// 한 층의 높이가 5미터 일 때, 건물이 몇 층인지 입력받아 높이와 최대 거주 인원을 출력하세요
		// Scanner s = new Scanner(System.in);
		// 예) 사용자가 35를 입력하면 높이는 35*5=175m
		// 최대 거주인원은 175/3=58명
		// 결과 = 입력하신 건물은 전체 175m이고 최대거주인원은 58명입니다
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("건물이 몇층인가요?");
		
		int a = s.nextInt();
		int b = a * 5;
		int c = b / 3;
		
		System.out.println("입력하신 건물은 전체 " + b + "m이고 최대거주인원은 " + c + "명입니다");
		
		
	}

}
