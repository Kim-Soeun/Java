package sec02;

import java.util.Scanner;

public class 좌석수 {

	public static void main(String[] args) {

//		학생수 몇명?
//		한줄에 몇명씩 앉나요?

//		총 ~줄이고 남은 좌석수는 ~개 입니다

		Scanner s = new Scanner(System.in);
		System.out.println("학생수는 몇명인가요?");
		int num1 = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요?");
		int num2 = s.nextInt();

		int i = num1 % num2;
		int i2 = num1 / num2;

		int result1 = (i == 0) ? i2 :i2 + 1;
		int result2 = (i ==0 ) ? i : num2 - i;
		
//		int result1 = (num1 % num2 == 0) ? num1 / num2 : num1 / num2 + 1; // 총 줄 수
//		int result2 = (num1 % num2 == 0) ? num1 % num2 : num2 - num1 % num2; // 남은 학생 수

		System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다\n", result1, result2);

	}

}
