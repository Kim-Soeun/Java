package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class 시간맞추기게임 {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine();
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("현재 시작 : " + time + "초 입니다");
		return time;
	}

	public static void main(String[] args) {

		System.out.println("10초에 가까운 사람이 이기는 게임입니다");
		시간맞추기게임 game = new 시간맞추기게임();

		String[] name = { "홍길동", "장동건" };
		int time1, time2;
		int times[] = new int[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.print(name[i] + " 시작 <Enter>키 >>");
			time1 = game.start();
			System.out.print(name[i] + " 10초 예상 후 <Enter>키 >>");
			time2 = game.start();
			if(time1 > time2) 
				times[i] = (time2+60) - time1;
			else 
				times[i] = time2 - time1;
		}
		
		
		if( times[0] > times[1] || times[1]>10) 
			System.out.println("홍길동의 결과 " + times[0] + ", " + 
		"장동건의 결과 " + times[1] + ", 승자는 홍길동");
		else 
			System.out.println("홍길동의 결과 " + times[0] + ", " + 
		"장동건의 결과" + times[1] + ", 승자는 장동건");
	}
}
