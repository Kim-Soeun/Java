package sec02;

import java.util.Scanner;

public class 확인문제4re {

	public static void main(String[] args) {

//		사용자로부터 배열 개수를 입력 받으세요
//		배열 개수만큼 숫자를 입력 받아서 배열에 삽입하세요
//		해당 배열에서 가장 작은 숫자를 출력하세요
//		(단, 숫자는 양수만 가능함)
		
		Scanner s = new Scanner(System.in);
		System.out.println("배열 개수를 입력하세요");
		int array = s.nextInt();
		int[] num = new int[array];
		
		for(int i =0; i<num.length; i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요");
			num[i] = s.nextInt();
		}
		
		int min = num[0]; 
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min = num[i];
			}	
		}	System.out.println("min : " + min);
		
	}

}
