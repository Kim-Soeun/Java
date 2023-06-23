package sec02;

import java.util.Scanner;

public class 시험성적2 {

	public static void main(String[] args) {

		// 중간고사가 80점 이상이거나 기말고사가 80점 이상이면 "통과"
		// 아니면 "탈락"

		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적을 입력해 주세요");
		int mid = s.nextInt();
		System.out.println("기말고사 성적을 입력해 주세요");
		int last = s.nextInt();

		if (mid >= 80 || last >= 80) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}
	}
}