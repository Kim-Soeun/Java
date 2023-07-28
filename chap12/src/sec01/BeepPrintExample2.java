package sec01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		// 멀티 스레드 : 하나의 프로세스가 두 가지 이상의 작업을 처리할 수 있는 기능
		// 메인 스레드와 작업 스레드가 동시에 실행
		// 메인 스레드 : 출력,   작업 스레드 : 비프음 발생
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		// start() 메소드 호출해야 작업스레드 실행됨 
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
		
	}

}
