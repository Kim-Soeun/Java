package sec02;

public class ATM implements Runnable {

	private long depositeMoney = 100000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				// object�� �޼ҵ�
				// ������ �� �ϳ��� ����
				notify();
				
				try {
					wait(); 
					// ���� �ִ� ���� ���� �����ϰ� �����带 ���� ��
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
			}
		}
	}

	
	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� : %d �� %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

}
