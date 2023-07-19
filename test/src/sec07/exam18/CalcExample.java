package sec07.exam18;

import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수와 연산자를 입력하시오 >>");
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().charAt(0);  // 세번째 연산자를 char 타입으로 저장
		
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
				System.out.println("잘못된 연산자입니다");
				return;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		// 상속받은 각 클래스의 오버라이드한 메소드 호출
		System.out.println(result);
		
	}

}
