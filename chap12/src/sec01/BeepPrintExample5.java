package sec01;

import java.awt.Toolkit;

public class BeepPrintExample5 {

	public static void main(String[] args) {

		
		// 스레드 익명 객체로 작업 스레드 생성
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
			}
			}	
		};
		thread.start();		
		
		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
		
		
		
	}

}
