package sec01;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName() +  " : " + this.memory);
	}
	
	
	
}
