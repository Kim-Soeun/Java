package sec01;

public class SumExample2 {

	public static void main(String[] args) {
		
		// 매개값으로 Runnable 익명 구현 객체 넣어줌
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					if (i%2==0) {
						try { Thread.sleep(500); } catch(Exception e) {}
						System.out.println(i);
					}
				}
			}
			
		});
		thread.start();
		
		

		// 1부터 10까지 홀수만 출력
		for(int i=1; i<=10; i++) {
			if (i%2==1) {
				try { Thread.sleep(500); } catch(Exception e) {}
				System.out.println(i);
			}
			
		}
		
		
		// 1부터 10까지 짝수만 출력
//		for(int i=1; i<=10; i++) {
//			if (i%2==0) {
//				System.out.println(i);
//			}
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}
//		
	}

}
