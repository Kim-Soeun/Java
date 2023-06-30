package sec02;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		
//		좋아하는 계절을 입력했을 때 
//		봄 1, 여름 2, 가을 3, 겨울 4
//		다른 숫자를 입력하면 다시 입력하도록 반복
//		배열 사용하기

		Scanner s = new Scanner(System.in);

		String[] weather = new String[4];
		weather[0] = "봄";
		weather[1] = "여름";
		weather[2] = "가을";
		weather[3] = "겨울";

		boolean run = true;
		while (run) {
			System.out.println("좋아하는 계절을 입력하세요");
			System.out.println("봄은 1, 여름 2, 가을 3, 겨울 4");

			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0] + "을 선택하셨습니다");
				run = false;
				break;
			case 2:
				System.out.println(weather[1] + "을 선택하셨습니다");
				run = false;
				break;
			case 3:
				System.out.println(weather[2] + "을 선택하셨습니다");
				run = false;
				break;
			case 4:
				System.out.println(weather[3] + "을 선택하셨습니다");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}

		}

	}

}
