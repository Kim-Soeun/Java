package sec02;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		
		// 일시정지 (sleep())
		// 예외처리 해줘야 함
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); 	// 3초에 한번씩 소리 발생
				System.out.println("띵");
				} catch(InterruptedException e) {
					System.out.println("인터럽트 오류가 발생했습니다");
				}
		}
		
		
	}

}
