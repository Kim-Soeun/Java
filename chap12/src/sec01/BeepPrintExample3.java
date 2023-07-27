package sec01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {

		// 스레드 매개값으로 Runnable의 익명 구현 객체 생성하여 넣어줌
		// 동시에 메인 스레드와 작업 스레드 실행됨
		
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // 소리 출력
					try {Thread.sleep(500);} catch (Exception e) {} // Thread.sleep(500) : 0.5초간 일시정지
				}

			}

		});
		thread.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
