package sec07.exam18;

public abstract class Calc {
	
	 int a;
	 int b;
	
	
	
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public abstract void setValue(int a, int b);
	public abstract int calculate();

}
