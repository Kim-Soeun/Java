package sec04;

public class 계산기 {
	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result;
		if (y > x) { // y가 더 컸을 때도 양수값이 나오도록 조건
			result = y - x;
		} else {
			result = x - y;
		}
		return result;

	}

	String mul(int x, int y) {
		if (x == 0 || y == 0) {
			String message = "0은 입력할 수 없습니다";
			return message;
		} else {
			int result = x * y;
			return String.valueOf(result);
		}
	}

	// 숫자가 0이면 "0은 사용할 수 없습니다" 출력

	double divide(int x, int y) {
			double result = (double) x / y;
			return result;
		}
	}


