package sec02;

public class InterruptExample {

	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();
		// ThreadB run() ����
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		thread.interrupt();
		// interrupt()�� �����ϸ� 
		// ThreadB�� sleep() �޼ҵ�� �Ͻ����� �� ��
		// InterruptedException �߻��Ͽ� catch ������� �̵�
		// �ᱹ Thread�� while�� �������� �޼ҵ� ��������
		
	}

}
