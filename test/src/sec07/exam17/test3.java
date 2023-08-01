package sec07.exam17;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
//		정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 
//		짝수만 출력하는 프로그램을 작성하시오.
//		
//		정수를 10개 입력하세요 : 1 5 99 22 345 154 2346 55 32 85
//		짝수는 : 22 154 2346 32

		

		Scanner s = new Scanner(System.in);
		System.out.print("정수 10개를 입력하세요 : ");
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextInt();
		}

		System.out.println("짝수는 : ");
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2==0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

}
