package sec07.exam18;

import java.util.Scanner;

public class Won2Dollar extends Converter {

	abstract protected double convert(double src) {
		
	}

	abstract protected String getSrcString(); // 추상 메소드

	abstract protected String getDestString(); // 추상 메소드

	protected double ratio; // 비율
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		   toDollar.run();
	}

}
