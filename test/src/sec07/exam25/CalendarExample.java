package sec07.exam25;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int ampm = now.get(Calendar.AM_PM);     // 0 : 오전, 1 : 오후
		
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다");
		 
		if (ampm==1) {
			hour += 12;
		}
		
		if(hour>=4 && hour<=12) {
			System.out.println("Good Morning");
		} else if(hour>=12 && hour<=18) {
			System.out.println("Good Afternoon");
		} else if(hour>=18 && hour<=22) {
			System.out.println("Good Night");
		} else {
			
		}
		
		
	}

				
}
