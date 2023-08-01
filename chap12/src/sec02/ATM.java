package sec02;

public class ATM implements Runnable {

	private long depositMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				// object의 메소드
				// 쓰레드 중 하나를 깨움
				notify();
				
				try {
					wait(); 
					// 갖고 있던 고유 락을 해제하고 스레드를 잠들게 함
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
			System.out.printf("잔액 : %d 원 %n", getDepositMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
		}
	}

	public long getDepositMoney() {
		return depositMoney;
	}

}
