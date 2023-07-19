package sec01;

public class OutterExample {

	public static void main(String[] args) {

		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
		
		
		// Nested가 만약 정적 클래스라면
		// Outter.Nested nested = new Outter.Nested();
		
	}

}
