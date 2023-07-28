package sec01;

public class Sleep extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
		try { Thread.sleep(700); } catch(Exception e) {}
		System.out.println("잠을 잡니다");
		}
	}
	
	
	

}
