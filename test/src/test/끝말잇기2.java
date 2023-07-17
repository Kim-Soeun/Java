package test;

import java.util.Scanner;

public class 끝말잇기2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("게임에 참가하는 인원을 입력하세요");
		int num = s.nextInt();
		String[] players = new String [num];
		
		for(int i=0; i<num; i++) {
			System.out.println("참가자의 이름을 입력하세요");
			players[i] = s.next();
		}
		
		System.out.println("시작하는 단어는 아버지입니다");
		
		
		String word1 = "아버지";
		
		
		while(true) {
			
			
			for (int j=0; j<num; j++) {
				
				System.out.print(players[j] + ">> ");
				String word2 = s.next();
			
			if(word1.charAt(word1.length()-1)==word2.charAt(0)) {
				word1 = word2;
			} else {
				System.out.println(players[j] + "님이 졌습니다");
				break;
			}
			
			
			}
		
		
	}
		
		
	}

}
