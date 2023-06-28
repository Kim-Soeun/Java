package sec02;

import java.util.Scanner;

public class while예제3 {

	public static void main(String[] args) {

//		int 타입의 변수 num을 선언하고 키보드로 값을 입력 받으세요
//		1~변수 num까지 합을 출력하는 프로그램을 작성해보세요.(while)
//		예) 정수 입력 : 10
//		1~10 합: 55
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i<=num) {
			sum += i;  // 0 + 1 + ... num 
			i++;
		}
			System.out.println("1 ~ " + num + " 합 : " + sum);
					
		}
		
	}


