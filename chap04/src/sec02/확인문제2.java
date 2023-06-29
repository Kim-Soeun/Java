package sec02;

public class 확인문제2 {

	public static void main(String[] args) {

//		160p
//		for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요.

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {   sum += i;        이것도 가능
			if (i % 3 != 0) {
				continue;
				
			}	sum += i;
		}
		System.out.println("1~100까지 3의 배수의 합계 : " + sum);

	}

}
