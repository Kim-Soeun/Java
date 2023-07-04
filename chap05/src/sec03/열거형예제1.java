package sec03;

import java.util.Calendar;

public class 열거형예제1 {

	public static void main(String[] args) { 
		// public이 붙었기 때문에 자유롭게 열거타입 가져올 수 있음
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // 날짜, 시간 정보
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		
		switch(week) {
		case 1 :
			today = Week.일요일;	// 한글, 영어 모두 가능
			break;
		case 2 :
			today = Week.월요일;
			break;
		case 3 :
			today = Week.화요일;
			break;
		case 4 :
			today = Week.수요일;
			break;
		case 5 :
			today = Week.목요일;
			break;
		case 6 :
			today = Week.금요일;
			break;
		case 7 :					//default로 대체 가능
			today = Week.토요일;
			break;
		}
			System.out.println("오늘 요일 : " + today);
			
			if (today==Week.일요일) {
				System.out.println("일요일은 축구를 합니다");
			} else {
				System.out.println("열심히 자바 공부를 합니다");
			}
			
	}

}
