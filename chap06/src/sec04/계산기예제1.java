package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {
		계산기 myCalc = new 계산기();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(3, 5);
		System.out.println(result1);
		
		int result2 = myCalc.minus(3, 5);
		System.out.println(result2);
		
		String result3 = myCalc.mul(9, 0);
		System.out.println(result3);
		
		byte x = 10;
		byte y = 4;
		double result6 = myCalc.divide(x, y);
		System.out.println(result6);
	}

}
