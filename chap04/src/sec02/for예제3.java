package sec02;

import java.util.Scanner;

public class for예제3 {

	public static void main(String[] args) {

//	 사용자로부터 숫자를 입력 받으세요(1~100 사이)
//   int 1부터 사용자가 입력한 숫자까지의 합계를 구하세요
//	 for문 활용
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합계는 : " + sum + "입니다");
	}

}
