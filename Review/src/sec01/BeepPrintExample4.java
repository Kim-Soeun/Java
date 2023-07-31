package sec01;

public class BeepPrintExample4 {

	public static void main(String[] args) {

		Thread beepThread = new BeepThread();
		beepThread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
		
		
		
		
		
	}

}
