package sec07.exam25;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		// Calendar 객체를 이용하시오. 프로그램을 실행한 현재 시간이 4시에서 낮 12시 이전이면 "Good Morning"을,
		// 오후 6시 이전이면 "Good Afternoon"을, 밤 10시 이전이면 "Good Evening"을, 
		// 그 이후는 "Good Night"을 출력하는 프로그램을 작성하세요.
		// 현재 시간은 10시 22분입니다.
		// Good Morning
		
		

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
