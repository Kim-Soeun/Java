package sec02;

public class PrintThread1 extends Thread {

	private boolean stop;


	public void setStop(boolean stop) {
		this.stop = stop;
	}


	@Override
	public void run() {
		while(!stop) {		 
		// stop�� true�� �Ǹ� run() ����
		// stop �ʵ尡 false�� ��� while ���ǹ��� true�� �Ǿ� �ݺ� ����
		// stop �ʵ尡 true�� ��� while ���ǹ��� false�� �Ǿ� while�� ��������
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
	
	
	
}
