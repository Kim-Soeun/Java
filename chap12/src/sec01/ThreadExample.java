package sec01;

public class ThreadExample {

	public static void main(String[] args) {

		// 539p 2¹ø¹®Á¦
		
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		
	}

}
