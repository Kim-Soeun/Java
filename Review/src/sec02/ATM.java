package sec02;

public class ATM implements Runnable {

	private long depositMoney=10000;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				notify();
				try {
					wait();
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					
				}
				if(getDepositMoney() <= 0) 
					break;
					withDraw(1000);
				
			}
		}
	}
	
	
	public void withDraw(long howMuch) {
		if(getDepositMoney() > 0) {
			depositMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() +  ", ");
			System.out.printf("ÀÜ¾× : %d¿ø %n" , getDepositMoney());
		}
	}
	
	public long getDepositMoney() {
		return depositMoney;
	}
	
	
}
