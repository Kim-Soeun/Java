package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("ù��° �۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("�ι�° �۾� ������ �̸� : " + threadB.getName());
		threadB.start();
		
		
	}

}
