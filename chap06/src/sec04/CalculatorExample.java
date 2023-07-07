package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.println("가나다");	//리턴값 x, 내부 호출 x
		
		int result1 = myCalc.plus(6, 4);
		System.out.println(result1);	//리턴값 o, 내부 호출 x
	
		
		double result2 = myCalc.avg(10, 15);
		System.out.println(result2);	//리턴값 o, 내부 호출 o
		
		myCalc.excute();    // 리턴값 x, 내부 호출 3번
		}

}
