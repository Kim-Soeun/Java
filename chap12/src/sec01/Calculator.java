package sec01;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	
	public void setMemory(int memory) {
		this.memory = memory;
//		try {								// 2초 일시정지를 설정하지 않으면 동시에 스레드 출력하기 때문에 메모리 변경되지 않음
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
