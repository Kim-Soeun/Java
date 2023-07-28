package sec02;

public class StopFlagExample {

	public static void main(String[] args) {
		
		// stop() 메소드로 갑자기 종료하게 되면 
		// 스레드가 사용중이던 자원들이 불안전한 상태로 남겨짐
		// 그래서 잘 사용하지 않음

		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
		}
		
		printThread.setStop(true); // true를 넘겨주면 while문 멈춤
		
		
	}

}
