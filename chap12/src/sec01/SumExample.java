package sec01;

public class SumExample {

	public static void main(String[] args) {
		
		
		Runnable sumTask = new SumTask();
		Thread thread = new Thread(sumTask);
		thread.start();
		
		
		

		// 1���� 10���� Ȧ���� ���
		for(int i=1; i<=10; i++) {
			if (i%2==1) {
				try { Thread.sleep(500); } catch(Exception e) {}
				System.out.println(i);
			}
			
		}
		
		
		// 1���� 10���� ¦���� ���
//		for(int i=1; i<=10; i++) {
//			if (i%2==0) {
//				System.out.println(i);
//			}
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}
//		
	}

}
