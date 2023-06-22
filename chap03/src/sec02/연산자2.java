package sec02;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {

//		scanner 이용
//		x의 초기값을 입력해 주세요
//		y의 초기값을 입력해 주세요
//		증감 기호를 입력해 주세요(+,-)
//		만약 증감 기호가 +라면 x의 값을 1 증가시켜서 출력
//		만약 증감 기호가 -라면 y의 값을 1 감소시켜서 출력
		
		Scanner s = new Scanner(System.in);
		System.out.println("x의 초기값을 입력해 주세요");
		int a = s.nextInt();
		System.out.println("y의 초기값을 입력해 주세요");
		int b = s.nextInt();
		System.out.println("증감 기호를 입력해 주세요(+,-)");
		String c = s.next();
		
		if (c.equals("+")) {
			a++;
		}
		else if (c.equals("-")) {
			b--;
		}
		System.out.println("x = " + a + ", y = " + b);

		
	}

}
