package sec02;

public class for문예제6 {

	public static void main(String[] args) {

//		32에서 59까지의 숫자 중 짝수만 출력하는 프로그램을 작성해보세요.(for문 사용)
		
		for (int i = 32; i<=59; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
