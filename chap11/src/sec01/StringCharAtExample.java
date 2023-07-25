package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2명의 이름과 처리코드를 입력 받으세요
		// 예) 홍길동 C88, 장동건 B70
		// 맨 앞 문자는 등급, 나머지 2글자는 점수입니다
		// 등급은 A~D등급까지 존재하고
		// A등급은 점수에 20% 가산, B등급은 점수에 10% 가산
		// C등급은 점수에 5% 가산입니다

		// 최종점수가 90점 이상이면 "최우수", 80 이상이면 "우수"
		// 나머지는 "일반"
		// 최종 출력 -> 홍길동님은 최우수 등급입니다

		Scanner s = new Scanner(System.in);
		String[] names = new String[2];
		String[] code = new String[2];
		int[] score = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println(i+1 + "번째 이름과 처리코드를 입력하세요");
			names[i] = s.next();
			code[i] = s.next();
		}

		for (int i = 0; i < 2; i++) {
			String num = code[i].substring(1);
			score[i] = Integer.parseInt(num);
			
			switch (code[i].charAt(0)) {
			case 'A': case 'a' :
				score[i] *= 1.2;
				break;
			case 'B': case 'b':
				score[i] *= 1.1;
				break;
			case 'C': case 'c':
				score[i] *= 1.05;
				break;
			default :
				score[i] = 0;
				break;
			}
		}
		
		for(int i=0; i<2; i++) {
			if(score[i]>=90) {
				System.out.println(names[i] + "님은 최우수 등급입니다");
			} else if(score[i]>=80) {
				System.out.println(names[i] + "님은 우수 등급입니다");
			} else if(score[i]==0){
				System.out.println(names[i] + "님은 잘못 입력 하셨습니다");
			} else {
				System.out.println(names[i] + "님은 일반 등급입니다");
			}
		}

	}

}
