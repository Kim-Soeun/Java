package sec02;

public class continue예제2 {

	public static void main(String[] args) {

//		1~100까지 숫자 중에서 3의 배수이면서 5의 배수인 숫자만 출력하세요

		for(int i = 1; i<=100; i++) {
			if (i%3!=0 || i%5!=0) {
				continue;
			} 
			System.out.println(i);
		}
	}

}
