package sec01;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	
	// Thread 클래스 상속 후 run() 메소드 재정의해서
	// 스레드가 실행할 코드 작성

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}

		}

	}

}
