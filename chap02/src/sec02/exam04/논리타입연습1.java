package sec02.exam04;

public class 논리타입연습1 {

	public static void main(String[] args) {
		boolean stop = true; // false이면 "시작합니다"가 출력됨
		if (stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}

		int a = 3;
		if (a == 1) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

		String b = "중지";
		if (b == "중지") {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다");
		}
	}

}
