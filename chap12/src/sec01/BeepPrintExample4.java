package sec01;

public class BeepPrintExample4 {

	public static void main(String[] args) {

		// Thread를 상속받은 BeepThread 이용해서 
		// 작업스레드 객체 생성
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
		
	}

}
