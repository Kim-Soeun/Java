package sec01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		// 메인 스레드만 이용한 경우
		// 비프음 발생과 출력은 서로 다른 작업이므로 
		// 메인 스레드가 동시에 두 가지 작업 처리할 수 없음
		// 다음과 같이 작성시 메인 스레드는 비프음 모두 발생 후 출력 시작
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();			// Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();   									// 소리 출력
			try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5초간 일시정지
		}
		
		for(int i=0; i<5; i++) {								// 비프음 모두 발생 후 출력 시작
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
		
	}

}
