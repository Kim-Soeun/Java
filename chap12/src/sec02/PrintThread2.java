package sec02;

public class PrintThread2 extends Thread {


	// interrupt() 메소드는 스레드가 일시정지 상태일 때
	// InterruptedException을 발생시키는 역할
	// 단, Thread가 일시 정지 상태 되지 않으면 의미 x 

	@Override
	public void run() {

		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("인터럽트 오류 발생");
		}
		
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
	
	
	
	
}
