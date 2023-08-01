package sec07.exam17;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
//      Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하시오.
//		정수를 입력하세요 : 5
//		*****
//		****
//		***
//		**
//		*
		

		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = s.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}	System.out.println(" ");
		}
	}

}
