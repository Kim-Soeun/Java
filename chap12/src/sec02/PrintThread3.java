package sec02;

public class PrintThread3 extends Thread {

	@Override
	public void run() {

	
			while(true) {
				System.out.println("실행 중");
				
				// interrupt() 메소드 호출하면 
				// 스레드의 interrupted(), isinterrupted() 메소드는 true 리턴
				// if 실행돼서 break; 실행   ->    while문 빠져나옴 
				if(Thread.interrupted()) {		
					break;						
				}
			}
		

		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
		
	}

}
