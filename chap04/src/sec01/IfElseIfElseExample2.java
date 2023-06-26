package sec01;

import java.util.Scanner;

public class IfElseIfElseExample2 {

	public static void main(String[] args) {

//		중간고사 성적, 기말고사 성적 평균점수가 90점 이상이면 "A"학점
//		중간고사 성적, 기말고사 성적 평균점수가 80점 이상이면 "B"학점
//		나머지는 "C"학점이되 어느 한 과목이라도 60점 미만이면 "재수강"

		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.println("기말고사 성적은?");
		int last = s.nextInt();
		int average = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("재수강");
		} else if (average >= 90) {
			System.out.println("A학점");
		} else if (average >= 80) {
			System.out.println("B학점");
		} else {
			System.out.println("C학점");
		}

	}

}
