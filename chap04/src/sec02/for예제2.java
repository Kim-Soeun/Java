package sec02;

public class for예제2 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 100; i += 3) {
//			if (i%3==0) {
			sum += i;

		}
		System.out.println("1~100까지 3의 배수의 합계 : " + sum);
	}

}
