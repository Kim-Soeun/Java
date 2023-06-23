package sec02;

import java.util.Scanner;

public class ConditionalOperationExample2 {

	public static void main(String[] args) {

//		사용자가 점수를 입력합니다
//		점수가 90점 이상 "수", 80점 이상 "우" 나머지 "미"
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = s.nextInt();
		char grade = (num > 90) ? '수' : (num > 80) ? '우' : '미';
		System.out.println(num + "점은 '" + grade + "' 등급입니다");
		
	}

}
