package sec02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		
		// Calendar 클래스는 운영체제 기준으로 추출
		// Calendar 클래스는 바로 new 객체 생성 불가능
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("현재 시각 : " + hour);
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		// 오전 : 0,   오후 : 1
	}

}
