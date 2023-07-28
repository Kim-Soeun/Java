package sec02;

public class PrintThread1 extends Thread {

	private boolean stop;


	public void setStop(boolean stop) {
		this.stop = stop;
	}


	@Override
	public void run() {
		while(!stop) {		 
		// stop이 true가 되면 run() 종료
		// stop 필드가 false일 경우 while 조건문이 true가 되어 반복 실행
		// stop 필드가 true일 경우 while 조건문이 false가 되어 while문 빠져나옴
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	
	
	
}
