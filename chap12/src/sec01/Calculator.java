package sec01;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	
	public void setMemory(int memory) {
		this.memory = memory;
//		try {								// 2�� �Ͻ������� �������� ������ ���ÿ� ������ ����ϱ� ������ �޸� ������� ����
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
