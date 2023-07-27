package sec01;

public class ThreadA extends Thread {

	public ThreadA() {				// 스레드 이름 설정
		setName("쓰레드에이");
	}

	@Override
	public void run() {				// ThreadA 실행 내용
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
		
	}
	
	
	
}
