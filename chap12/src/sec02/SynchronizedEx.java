package sec02;

public class SynchronizedEx {
	
	public static void main(String[] args) {

		ATM atm = new ATM();
		Thread mother = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		// 매개변수에 넣어준 값은 Runnable, 스레드 이름으로 변경으로 설정됨
		mother.start();
		son.start();
		
		
	}

}
