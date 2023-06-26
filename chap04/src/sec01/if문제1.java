package sec01;

import java.util.Scanner;

public class if문제1 {

	public static void main(String[] args) {

//		50점 이상이면 "합격입니다"  50점 미만이면 "재시험을 보세요"
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = s.nextInt();
		
		if (score>= 50) {
			System.out.println("점수 :" + score);
			System.out.println("합격입니다.");
		}	else {
			System.out.println("점수 :" + score);
			System.out.println("재시험을 보세요.");
		}
		
	}

}
