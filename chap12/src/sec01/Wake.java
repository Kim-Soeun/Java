package sec01;

public class Wake implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
		try { Thread.sleep(500); } catch(Exception e) {}
		System.out.println("����մϴ�");
		}
	}

	
}
