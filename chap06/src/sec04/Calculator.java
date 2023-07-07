package sec04;

public class Calculator {
	int plus(int x, int y) {		// 합계 구하는 메소드
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {		//  평균 구하는 메소드
		double sum = plus(x,y);		// 객체 내부에서 합계 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7,10);
		println("실행결과 : " + result);	// 문자열 + 숫자이기 때문에 = 문자열
	}									// println은 void println을 호출만 하고 값을 받지 않기 때문에 앞에 아무것도 붙지 x 
	
	void println(String message) {
		System.out.println(message);
	}
}
