package sec01;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	// 작업을 정의하는 Runnable 구현 클래스 작성
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();			
		for(int i=0; i<5; i++) {
			toolkit.beep();   									
			try { Thread.sleep(500); } catch(Exception e) {}	
		}
	}
	
	
	
	

}
