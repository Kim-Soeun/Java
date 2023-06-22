package sec02.exam04;

import java.util.Scanner;

public class 응용문제4 {

	public static void main(String[] args) {
//		이름과 나이를 입력 받으세요
//		만약 나이가 20살 미만이면 "청년" 아니면 "장년"
//		홍길동을 입력하고 15세를 입력하면 "홍길동님은 청년입니다"가 출력된다
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = s.next();

		System.out.println("나이를 입력하세요.");
		int age = s.nextInt();
		
		System.out.print(name + "님은 ");
		
		if(age<20) {
			System.out.println("청년입니다.");
		} else {
			System.out.println("장년입니다.");
		}
	}

}
