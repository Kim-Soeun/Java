package sec02;

public class break예제2 {

	public static void main(String[] args) {

		do {
			int num = (int) (Math.random() * 6) + 1;
			// 1부터 6까지 랜덤 숫자 추출
			System.out.println(num);
			if (num == 6) {
				break;
			}

		} while (true);

		System.out.println("프로그램 종료");
	}

}
