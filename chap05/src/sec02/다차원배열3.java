package sec02;

import java.util.Scanner;

public class 다차원배열3 {

	public static void main(String[] args) {

//		반복문 이용하여 3명의 이름을 입력 받으세요
//		예) 철수, 영희, 순희
//		3줄 2칸 짜리 배열 생성
//		첫번째 칸은 중간고사, 두번째 칸은 기말고사 성적입니다
//		사용자로부터 시험점수를 반복문 이용하여 입력 받으세요
//		3명의 평균점수를 출력하세요
//		예) 철수 평균점수 : 57.9점

		Scanner s = new Scanner(System.in);
		String[] name = new String[3];
		for(int i=0; i<name.length; i++) {
			System.out.println((i+1) + "번째 사람 이름을 입력하세요");
			name[i] = s.next();
		}

		int[][] scores = new int[3][2];
		double[] result = new double[3];
		
		for(int i=0; i<scores.length; i++) {
			int sum=0;
			for(int j=0; j<scores[i].length;j++) {
				if(j==0) {
					System.out.println(name[i] + "의 중간점수를 입력하세요");
				}	else {
					System.out.println(name[i] + "의 기말점수를 입력하세요");
				}	scores[i][j] = s.nextInt();
					sum += scores[i][j];
			}	result[i] = (double) sum/2;
		}

		for(int i=0; i<result.length; i++) {
			System.out.println(name[i] + "의 평균점수는 " + result[i] + "입니다");
		}
	}

}
