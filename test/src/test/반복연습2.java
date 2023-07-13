package test;

import java.util.Scanner;

public class 반복연습2 {

	public static void main(String[] args) {
		
		// 컴퓨터, 나하고 윷놀이 게임(도,개,걸,윷,모)
		// 1 - 게임시작 2- 게임 종료
		// 1을 누르면 컴퓨터 랜덤으로 출력한 결과 -> 예) 컴퓨터 : 걸
		// 1을 누르면 나의 랜덤으로 출력한 결과 -> 예) 너 : 윷
		// 결과 출력   ->   예) 내가 이겼습니다 

		Scanner s = new Scanner(System.in);

		boolean game = true;
		while (game) {
			System.out.println("윳놀이 게임을 시작합니다");
			System.out.println("1은 게임 시작, 2는 게임 종료");
			int start = s.nextInt();

			if (start == 2) {
				System.out.println("게임을 종료합니다");
				game = false;
			} else {
				
				int comNum = (int)(Math.random()*5)+1;
				int myNum = (int)(Math.random()*5)+1;
				char result2 = result1(comNum);
				char result3 = result1(myNum);
				
				System.out.println("컴퓨터 결과 : " + result2);
				System.out.println("나의 결과 : " + result3);
				
				if (comNum>myNum) {
					System.out.println("컴퓨터가 이겼습니다");
				}	else if(comNum<myNum) {
					System.out.println("내가 이겼습니다");
				}	else {
					System.out.println("비겼습니다");
				}
					
				
			}
			
		}
	}
	
	static char result1(int x) {
		char result = ' ';
		switch(x) {
			case 1 :
			result = '도';
			break;
			case 2 :
				result = '개';
				break;
			case 3 :
				result = '걸';
				break;
			case 4 :
				result = '윷';
				break;
			default :
				result = '모';
				break;
		}	return result;
	}	

	
		
}
