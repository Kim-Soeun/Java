package sec02;

public class InterruptExample {

	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();
		// ThreadB run() 실행
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		thread.interrupt();
		// interrupt()를 실행하면 
		// ThreadB가 sleep() 메소드로 일시정지 될 때
		// InterruptedException 발생하여 catch 블록으로 이동
		// 결국 Thread는 while문 빠져나와 메소드 정상종료
		
	}

}
