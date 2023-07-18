package sec07.exam18;

public abstract class Calc {
	
	private int a;
	private int b;
	
	
	
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public abstract void setValue();
	public abstract void calculate();

}
