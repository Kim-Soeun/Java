package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {

//		int 타입의 변수 num1의 초기값으로 1~6 중에서 하나의 수를 무작위로 뽑는다.
//		int 타입의 변수 num2 1~6 사이 숫자를 입력하세요
// 	 	두 수가 일치하면 "두 수가 일치합니다"
//		컴퓨터 숫자가 더 크면 "컴퓨터 숫자가 더 큽니다"
//		사용자 숫자가 더 크면 "사용자 숫자가 더 큽니다"

		int num1 = (int) (Math.random() * 6) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(1~6)");
		int num2 = s.nextInt();

		System.out.println("컴퓨터 수 : " + num1);
		System.out.println("사용자 수 : " + num2);
		if (num1 == num2) {
				System.out.println("두 수가 일치합니다");
		} else if (num1 > num2) {
			System.out.println("컴퓨터 숫자가 더 큽니다");
		} else {
			System.out.println("사용자 숫자가 더 큽니다");
		}

	}

}
