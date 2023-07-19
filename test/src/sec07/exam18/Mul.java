package sec07.exam18;

public class Mul extends Calc{

	Mul(int a, int b) {
		super(a,b);
	}
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		int result = a * b;
		return result;
	}
	
}
