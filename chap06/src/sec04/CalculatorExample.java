package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.println("������");	//���ϰ� x, ���� ȣ�� x
		
		int result1 = myCalc.plus(6, 4);
		System.out.println(result1);	//���ϰ� o, ���� ȣ�� x
	
		
		double result2 = myCalc.avg(10, 15);
		System.out.println(result2);	//���ϰ� o, ���� ȣ�� o
		
		myCalc.excute();    // ���ϰ� x, ���� ȣ�� 3��
		}

}
