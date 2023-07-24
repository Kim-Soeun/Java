package sec01;

public class MyPoint {

	private int num1;
	private int num2;
	
	public MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	@Override
	public boolean equals(Object obj) {
			MyPoint p = (MyPoint) obj;
			if(this.num1==p.num1 && this.num2==p.num2) {
				return true;
			}
		
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Point(" + num1 + ", " + num2 + ")";
	}
	
	
	
}
