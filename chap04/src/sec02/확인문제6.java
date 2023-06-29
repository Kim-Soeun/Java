package sec02;

public class 확인문제6 {

	public static void main(String[] args) {

//		161p 6번 문제
//		    *
//   	   **
//		  ***
//		 ****

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) {
				System.out.print(" "); // 공백 출력
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
		}
			System.out.println(); // 줄 변경
		}
		
	}

}