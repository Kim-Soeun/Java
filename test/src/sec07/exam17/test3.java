package sec07.exam17;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

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
