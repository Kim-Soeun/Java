package sec03.exam08;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
//		돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전이 
//		각 몇개로 변환되는지 출력하라.
//		예) 53254를 입력하면, 오만원권 1장, 천원권 3장, 백원동전 2개, 오십원동전 1개, 십원동전 4개
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("돈의 액수를 입력하세요");
		int money = s.nextInt();
		
		System.out.println("오만원권 " + money/50000 + "개");
		money = money % 50000;
		System.out.println("만원권 " + money/10000 + "개");
		money = money % 10000;
		System.out.println("천원권 " + money/1000 + "개");
		money = money % 1000;
		System.out.println("백원동전 " + money/100 + "개");
		money = money % 100;
		System.out.println("십원동전 " + money/10 + "개");
		
		

	}

}
