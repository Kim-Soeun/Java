package sec01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		
		
	}

}
