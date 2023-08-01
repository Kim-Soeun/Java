package sec02;

public class ATM implements Runnable {

	private long depositMoney = 10000;

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
				if (getDepositMoney() <= 0)
					break;
				withDraw(1000);
			}
		}
	}

	
	public void withDraw(long howMuch) {
		if (getDepositMoney() > 0) {
			depositMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� : %d �� %n", getDepositMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
		}
	}

	public long getDepositMoney() {
		return depositMoney;
	}

}
