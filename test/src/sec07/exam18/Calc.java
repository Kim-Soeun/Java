package sec07.exam18;

public abstract class Calc {
	
	 int a;
	 int b;
	
	
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	abstract int calculate();

}



 class Add extends Calc {
	public int calculate() {
		return a + b;
	}

 }
 
 
	class Sub extends Calc {
		public int calculate() {
			return a - b;
		}
}

	
    class Mul extends Calc {
		public int calculate() {
			return a * b;
		}
}
    
    
    class Div extends Calc {
		public int calculate() {
			if (b==0) {
				return -1;
			} else {
				
			} return a / b;
			
		}
}
	
	


