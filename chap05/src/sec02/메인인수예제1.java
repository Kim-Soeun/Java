package sec02;

public class 메인인수예제1 {

	public static void main(String[] args) {

//		run - run configuration - Argument - 숫자 2개 입력 - Apply - 결과 출력
//		188p
		
		if(args.length!=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1]; // args가 String타입이기 때문에 문자열로 받음
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
