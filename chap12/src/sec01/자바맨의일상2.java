package sec01;

import java.util.Calendar;

public class 자바맨의일상2 {

	public static void main(String[] args) {

		// 자바맨의 일상 (메인)

		// 오늘 날짜 출력 -> 오늘은 2023년 7월 28일 입니다 (메인)
		// 기상합니다 -> 스레드(기본 방식, 클래스)
		// 공부합니다 -> 스레드(익명 구현 객체)
		// 잠을 잡니다 -> 스레드(상속 방식)

		// 내일 날짜 출력 -> 오늘은 2023년 7월 29일 입니다 (메인)
		// 기상합니다 -> 스레드
		// 공부합니다 -> 스레드
		// 잠을 잡니다 -> 스레드

		System.out.println("자바맨의 일상");
		
		

		

		// 기본방식
		Runnable wake = new Wake();
		Thread thread1 = new Thread(wake);
		thread1.start();
		

		
		// 익명 구현 객체
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
				System.out.println("공부합니다");

			}
			}
		});
		thread2.start();

		
		
		// 상속 방식
		Thread thread3 = new Sleep();
		thread3.start();
	

		
		Calendar cal = Calendar.getInstance();
		
		
		for (int i = 0; i < 2; i++) {

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int date = cal.get(Calendar.DATE);
			System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 입니다");

			
			cal.add(Calendar.DATE, 1);
			
			try {
			Thread.sleep(800);
			} catch (Exception e) {
			}
			
		}
		
		
	}

}
