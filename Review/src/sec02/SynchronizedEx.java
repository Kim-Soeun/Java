package sec02;

public class SynchronizedEx {

	public static void main(String[] args) {

		Runnable atm = new ATM();
		Thread mother = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		
		mother.start();
		son.start();
		
		
	}

}
