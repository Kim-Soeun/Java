package sec07.exam18;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int result = 0;
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >>");
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().charAt(0);  // ����° �����ڸ� char Ÿ������ ����
		
		Calc cal;
		switch(c) {
			case '+' :
				cal = new Add();
				break;
			case '-' :
				cal = new Sub();
				break;
			case '*' :
				cal = new Mul();
				break;
			case '/' :
				cal = new Div();
				break;
			default :
				System.out.println("�߸��� �������Դϴ�");
				return;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		// ��ӹ��� �� Ŭ������ �������̵��� �޼ҵ� ȣ��
		System.out.println(result);
		
	}

}
