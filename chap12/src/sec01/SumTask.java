package sec01;

public class SumTask implements Runnable {

	// Runnable에 유일하게 있는 run() 메소드 재정의
	// 스레드 실행 내용
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if (i%2==0) {
				try { Thread.sleep(600); } catch(Exception e) {}
				System.out.println(i);

			}
			
		}
		
	}

	
}
