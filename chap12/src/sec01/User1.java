package sec01;

public class User1 extends Thread {

	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");		// ������ �̸��� User1���� ����
		this.calculator = calculator;
	}

	
	@Override
	public void run() {
		calculator.setMemory(100);	// ���� ��ü�� Calculator�� �޸𸮿� 100 ����
	}
	
	
	
	
}
