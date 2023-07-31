package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("기본 쓰레드 이름 : " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("첫번째 작업 쓰레드 이름 : " + threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("두번째 작업 쓰레드 이름 : " + threadB.getName());
		threadB.start();
		
		
	}

}
