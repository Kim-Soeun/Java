package sec01;

public class SumTask implements Runnable {

	// Runnable�� �����ϰ� �ִ� run() �޼ҵ� ������
	// ������ ���� ����
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if (i%2==0) {
				try { Thread.sleep(600); } catch(Exception e) {}
				System.out.println(i);

			}
			
		}
		
	}

	
}
