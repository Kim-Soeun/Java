package sec02;

public class StopFlagExample {

	public static void main(String[] args) {
		
		// stop() �޼ҵ�� ���ڱ� �����ϰ� �Ǹ� 
		// �����尡 ������̴� �ڿ����� �Ҿ����� ���·� ������
		// �׷��� �� ������� ����

		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
		}
		
		printThread.setStop(true); // true�� �Ѱ��ָ� while�� ����
		
		
	}

}
