package sec01;

public class 종료연습문제 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				if (i == 50) {
					System.out.println("50이 나와서 중지했습니다");
					System.exit(0);
				}
				
			}
		}
	}

}
