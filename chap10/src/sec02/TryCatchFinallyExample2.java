package sec02;

public class TryCatchFinallyExample2 {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다");
			return;
			// return : main 메소드 종료, 아래 코드 실행 x
		} 
		
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두 수의 합은 : " + result);
		} catch (Exception e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} finally {					
			// 생략 가능, 예외 발생 finally는 항상 실행됨
			System.out.println("다시 실행하세요");
		}
		
		
	}

}
