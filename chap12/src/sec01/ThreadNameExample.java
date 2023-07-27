package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {		// 스레드의 이름

		// 현재 메인 구문 스레드의 참조 얻음
		Thread mainThread = Thread.currentThread();  
		// getName() : 스레드 이름 가져옴
		System.out.println("기본 쓰레드 이름 : " + mainThread.getName());  // main 출력
		
		// Thread를 상속받은 ThreadA 객체 생성
		// 작업 쓰레드의 이름 얻음
		ThreadA threadA = new ThreadA();
		System.out.println("첫번째 작업 쓰레드 이름 : " + threadA.getName()); // Thread-0 출력
		threadA.start();         									   // ThreadA에 재정의한 run() 호출
																	   // 바꾼 이름 출력
		
		ThreadB threadB = new ThreadB();
		System.out.println("첫번째 작업 쓰레드 이름 : " + threadB.getName()); // Thread-1 출력
		threadB.start();
		
		
	}

}
